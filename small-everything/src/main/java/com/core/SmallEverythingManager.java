package com.core;

import com.config.SmallEverythingConfig;
import com.core.common.HandlePath;
import com.core.dao.DataSourceFactory;
import com.core.dao.FileIndexDao;
import com.core.dao.impl.FileIndexDaoImpl;
import com.core.index.FileScan;
import com.core.index.impl.FileScanImpl;
import com.core.interceptor.impl.FileIndexInterceptor;
import com.core.interceptor.impl.ThingClearInterceptor;
import com.core.model.Condition;
import com.core.model.Thing;
import com.core.monitor.FileWatch;
import com.core.monitor.impl.FileWatchImpl;
import com.core.search.FileSearch;
import com.core.search.impl.FileSearchImpl;
import javax.sql.DataSource;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SmallEverythingManager {

    private static volatile SmallEverythingManager manager;

    private FileSearch fileSearch;

    private FileScan fileScan;

    private ExecutorService executorService;

    /**
     * 清理删除的文件
     */
    private ThingClearInterceptor thingClearInterceptor;
    private Thread backgroundClearThread;

    private AtomicBoolean backgroundClearThreadStatus =
            new AtomicBoolean(false);

    /**
     * 文件监控
     */
    private FileWatch fileWatch;

    private SmallEverythingManager(){
        this.initComponent();
    }

    private void initComponent(){
        //数据源对象
        DataSource dataSource = DataSourceFactory.dataSource();

        /**
         * 检查数据库
         */
        initOrResetDatabase();


        //业务层对象
        FileIndexDao fileIndexDao = new FileIndexDaoImpl(dataSource);

        this.fileSearch = new FileSearchImpl(fileIndexDao);

        this.fileScan = new FileScanImpl();

        //Print真正发布代码不需要
        //this.fileScan.interceptor(new FilePrintInterceptor());
        this.fileScan.interceptor(new FileIndexInterceptor(fileIndexDao));

        this.thingClearInterceptor = new ThingClearInterceptor(fileIndexDao);

        this.backgroundClearThread = new Thread(this.thingClearInterceptor);

        this.backgroundClearThread.setName("Thread-Thing-Clear");

        this.backgroundClearThread.setDaemon(true);

        //FileWatch  文件监控对象
        this.fileWatch = new FileWatchImpl(fileIndexDao);
    }


    //在第一次使用的时候会初始化数据库，重建索引需要初始化数据库
    public void initOrResetDatabase(){

        DataSourceFactory.initDatabase();
    }

    public static SmallEverythingManager getInstance(){
        if(manager == null){
            synchronized (SmallEverythingManager.class){
                if(manager == null){
                    manager = new SmallEverythingManager();
                }
            }
        }
        return manager;
    }
    /**
     * 检索
     */
    public List<Thing> search(Condition condition){
        // NOTICE扩展
        //Stream 流式处理 JDK8
        return this.fileSearch.search(condition).stream().
                filter(thing -> {
                    String path = thing.getPath();
                    File f = new File(path);
                    boolean flag = f.exists();

                    if(!flag){
                        //不存在删掉，做删除操作
                        thingClearInterceptor.apply(thing);
                    }
                    return flag;
                }).collect(Collectors.toList());
    }

    /**
     * 索引,将文件存到数据库中
     */
    public void buildIndex(){

        initOrResetDatabase();

        Set<String> directories = SmallEverythingConfig.getInstance().getIncludePath();
        if(this.executorService == null){
            this.executorService = Executors.newFixedThreadPool
                    (directories.size(), new ThreadFactory() {
                private final AtomicInteger threadId =
                        new AtomicInteger(0);
                @Override
                public Thread newThread(Runnable r) {
                    Thread thread = new Thread(r);
                    thread.setName("Thread-Scan-"+ threadId.getAndIncrement());
                    return thread;
                }
            });
        }

        final CountDownLatch countDownLatch = new CountDownLatch(directories.size());

        System.out.println("Build index start...");

        for(String path : directories){
            this.executorService.submit(() -> {
                SmallEverythingManager.this.fileScan.index(path);
                //当前任务完成，值-1
                countDownLatch.countDown();
            });
        }

        /**
         * 阻塞，直到任务完成，值0
         */
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Build index complete...");
    }

    /**
     * 启动清理线程
     */
    public void startBackgroundClearThread(){
        if(this.backgroundClearThreadStatus.compareAndSet(false,true)){
            this.backgroundClearThread.start();
        }else{
            System.out.println("Cant repeat start BackgroundClearThread");
        }
    }

    /**
     * 启动文件系统监听
     */
    public void startFileSystemMonitor(){
        SmallEverythingConfig config = SmallEverythingConfig.getInstance();
        HandlePath handlePath = new HandlePath();
        handlePath.setIncludePath(config.getIncludePath());
        handlePath.setExcludePath(config.getExcludePath());
        this.fileWatch.monitor(handlePath);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("文件系统监控启动");
                fileWatch.start();
            }
        }).start();
    }
}
