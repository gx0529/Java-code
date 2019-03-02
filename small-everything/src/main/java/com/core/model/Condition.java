package com.core.model;

import lombok.Data;

@Data
public class Condition {
    private String name;
    private String fileType;
    //限制数量
    private Integer limit;

    /**
     * 检索结果的文件信息depth排序规则
     * 1.默认是true -> asc
     * 2.false -> desc
     */
    private Boolean orderByAsc;
}
