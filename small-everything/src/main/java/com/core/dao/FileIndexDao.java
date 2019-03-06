package com.core.dao;

import com.core.model.Condition;
import com.core.model.Thing;

import java.util.List;

/**
 * 业务层访问数据的CRUD
 */
public interface FileIndexDao {

    /**
     * 插入数据Thing
     * @param thing
     */
    void insert(Thing thing);

    /**
     * 删除数据Thing
     * @param thing
     */
    void delete(Thing thing);

    /**
     * 根据condition条件进行数据库的检索
     * @param condition
     * @return
     */
    List<Thing> search(Condition condition);

}