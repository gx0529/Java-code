package com.core.model;

import lombok.Data;

@Data //getter setter toString生成完成
public class Thing {
    /**
     * 文件名称（保留名称），只要文件的名称，不要路径
     * File D:/a/b/hello.txt -> hello.txt
     */
    private String name;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 文件路径深度
     */
    private Integer depth;

    /**
     * 文件类型
     */
    private FileType fileType;
}
