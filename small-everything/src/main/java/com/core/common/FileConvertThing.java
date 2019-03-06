package com.core.common;

import com.core.model.FileType;
import com.core.model.Thing;

import java.io.File;

//普通的工具类
public final class FileConvertThing {

    private FileConvertThing(){}

    public static Thing convert(File file){
        Thing thing = new Thing();
        thing.setName(file.getName());
        //返回的是一个绝对路径
        thing.setPath(file.getAbsolutePath());
        thing.setDepth(computerFileDepth(file));
        thing.setFileType(computerFileType(file));
        return thing;
    }

    private static int computerFileDepth(File file){
        String[] segments = file.getAbsolutePath().split("\\\\");
        return segments.length;
    }

    private static FileType computerFileType(File file){
        if(file.isDirectory()){
            return FileType.OTHER;
        }
        String fileName = file.getName();
        //字符串最后一次出现.的地方
        int index = fileName.lastIndexOf(".");
        if(index != -1 && index < fileName.length()-1){
            //防止abc.
            String extend = fileName.substring(index+1);
            return FileType.lookup(extend);
        }else {
            return FileType.OTHER;
        }

    }
}
