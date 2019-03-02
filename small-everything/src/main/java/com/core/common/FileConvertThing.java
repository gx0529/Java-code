package com.core.common;

import com.core.model.FileType;
import com.core.model.Thing;

import java.io.File;

public final class FileConvertThing {

    private FileConvertThing(){}

    public static Thing convert(File file){
        Thing thing = new Thing();
        thing.setName(file.getName());
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
        int index = fileName.lastIndexOf(".");
        if(index != -1 && index < fileName.length()-1){
            //abc.
            String extend = fileName.substring(index+1);
            return FileType.lookup(extend);
        }else {
            return FileType.OTHER;
        }

    }
}
