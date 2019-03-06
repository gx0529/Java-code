package com.core.index.impl;

import com.config.SmallEverythingConfig;
import com.core.index.FileScan;
import com.core.interceptor.FileInterceptor;

import java.io.File;
import java.util.LinkedList;

public class FileScanImpl implements FileScan {

    private SmallEverythingConfig config =
            SmallEverythingConfig.getInstance();

    private LinkedList<FileInterceptor> interceptors = new LinkedList<>();

    @Override
    public void index(String path) {
        File file = new File(path);

        if(file.isFile()){
            if(config.getExcludePath().contains(file.getParent())){
                return;
            }
        } else{
            if(config.getExcludePath().contains(path)){
                return;
            }else{
                //listFiles()方法是返回某个目录下所有文件和目录的绝对路径
                // 返回的是File数组
                File[] files = file.listFiles();
                if(files != null){
                    for(File file1 : files){
                        index(file1.getAbsolutePath());
                    }
                }
            }
        }

        // File Directory
        for(FileInterceptor interceptor : this.interceptors){
            interceptor.apply(file);
        }
    }

    @Override
    public void interceptor(FileInterceptor interceptor) {
        this.interceptors.add(interceptor);
    }
}
