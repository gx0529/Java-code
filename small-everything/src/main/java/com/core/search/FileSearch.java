package com.core.search;

import com.core.model.Condition;
import com.core.model.Thing;

import java.util.List;

//面向接口编程
public interface FileSearch {
    /**
     * 根据condition条件进行数据库的检索
     * @param condition
     * @return
     */
    List<Thing> search(Condition condition);
}
