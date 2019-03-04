package com.core.monitor.impl;

import com.core.common.FileConvertThing;
import com.core.common.HandlePath;
import com.core.dao.FileIndexDao;
import com.core.monitor.FileWatch;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.io.FileFilter;

public class FileWatchImpl implements FileWatch ,FileAlterationListener {

    private FileIndexDao fileIndexDao;

    private FileAlterationMonitor monitor;

    public FileWatchImpl(FileIndexDao fileIndexDao) {
        this.fileIndexDao = fileIndexDao;
        this.monitor = new FileAlterationMonitor(1000);
    }

    @Override
    public void start() {
        try {
            this.monitor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void monitor(HandlePath handlePath) {
        //监控的是includePath集合
        for(String path : handlePath.getIncludePath()){
            FileAlterationObserver observer = new FileAlterationObserver(path, new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String currentPath = pathname.getAbsolutePath();
                    for(String excludePath : handlePath.getExcludePath()){
                        if(excludePath.startsWith(currentPath)){
                            return false;
                        }
                    }
                    return true;
                }
            });

            observer.addListener(this);
            this.monitor.addObserver(observer);
        }
        //this.monitor.addObserver();
    }

    @Override
    public void stop() {
        try {
            this.monitor.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(FileAlterationObserver observer) {
        //observer.addListener(this);
    }

    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {
        //文件创建
        System.out.println("onFileCrete"+file);
        this.fileIndexDao.insert(FileConvertThing.convert(file));
    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {
        //文件删除
        System.out.println("onFileDelete"+file);
        this.fileIndexDao.delete(FileConvertThing.convert(file));
    }

    @Override
    public void onStop(FileAlterationObserver observer) {
        //observer.removeListener(this);
    }
}
