package com.core;

import com.config.SmallEverythingConfig;
import com.core.dao.DataSourceFactory;
import com.core.dao.FileIndexDao;
import com.core.dao.impl.FileIndexDaoImpl;
import com.core.index.FileScan;
import com.core.index.impl.FileScanImpl;
import com.core.interceptor.impl.FileIndexInterceptor;
import com.core.interceptor.impl.FilePrintInterceptor;
import com.core.model.Condition;
import com.core.model.Thing;
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
import java.util.concurrent.atomic.AtomicInteger;

public class SmallEverythingManager {
    private static volatile SmallEverythingManager manager;

    private FileSearch fileSearch;

    private FileScan fileScan;

    private ExecutorService executorService;

    private SmallEverythingManager(){
        this.initComponent();
    }

    private void initComponent(){
        //数据源对象
        DataSource dataSource = DataSourceFactory.dataSource();

        /**
         * 检查数据库
         */
        checkDatabase();


        //业务层对象
        FileIndexDao fileIndexDao = new FileIndexDaoImpl(dataSource);
        this.fileSearch = new FileSearchImpl(fileIndexDao);
        this.fileScan = new FileScanImpl();
        this.fileScan.interceptor(new FilePrintInterceptor());
        this.fileScan.interceptor(new FileIndexInterceptor(fileIndexDao));
    }

    private void checkDatabase(){
        String workDir = System.getProperty("user.dir");
        String fileName = workDir+ File.separator+".mv.db";
        File dbFile = new File(fileName);
        if(dbFile.isFile() && !dbFile.exists()){
            DataSourceFactory.initDatabase();
        }
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
        return this.fileSearch.search(condition);
    }

    /**
     * 索引
     */
    public void buildIndex(){
        Set<String> directories = SmallEverythingConfig.getInstance().getIncludePath();
        if(this.executorService == null){
            this.executorService = Executors.newFixedThreadPool(directories.size(), new ThreadFactory() {
                private final AtomicInteger threadId = new AtomicInteger(0);
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
            this.executorService.submit(new Runnable() {
                @Override
                public void run() {
                    SmallEverythingManager.this.fileScan.index(path);
                    //当前任务完成，值-1
                    countDownLatch.countDown();
                }
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
}
