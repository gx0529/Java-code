package com.core.search.impl;

import com.core.dao.FileIndexDao;
import com.core.model.Condition;
import com.core.model.Thing;
import com.core.search.FileSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务层
 */
public class FileSearchImpl implements FileSearch {

    private final FileIndexDao fileIndexDao;

    public FileSearchImpl(FileIndexDao fileIndexDao) {
        this.fileIndexDao = fileIndexDao;
    }

    @Override
    public List<Thing> search(Condition condition) {
        if(condition == null){
            return new ArrayList<>();
        }
        return this.fileIndexDao.search(condition);
    }

}
