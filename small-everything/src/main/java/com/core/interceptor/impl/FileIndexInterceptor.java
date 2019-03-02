package com.core.interceptor.impl;

import com.core.common.FileConvertThing;
import com.core.dao.FileIndexDao;
import com.core.interceptor.FileInterceptor;
import com.core.model.Thing;

import java.io.File;

public class FileIndexInterceptor implements FileInterceptor {
    private final FileIndexDao fileIndexDao;

    public FileIndexInterceptor(FileIndexDao fileIndexDao) {
        this.fileIndexDao = fileIndexDao;
    }

    @Override
    public void apply(File file) {
        Thing thing = FileConvertThing.convert(file);
        fileIndexDao.insert(thing);
    }
}
