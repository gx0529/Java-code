package com.config;

import lombok.Getter;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

@Getter
public class SmallEverythingConfig {

    private static volatile SmallEverythingConfig config;

    private SmallEverythingConfig(){
        this.initDefaultPathsConfig();
    }

    private void initDefaultPathsConfig(){
        //1.获取文件系统
        FileSystem fileSystem = FileSystems.getDefault();

        //遍历目录
        Iterable<Path> iterable = fileSystem.getRootDirectories();
        iterable.forEach(path -> config.getIncludePath().add(path.toString()));

        //排除目录
        //windows : C:\Windows  C:\Program Files (x86)  C:\Program Files  C:\ProgramData
        //linux : /tmp  /etc
        String osname = System.getProperty("os.name");
        if(osname.startsWith("Windows")){
            config.getExcludePath().add("C:\\Windows");
            config.getExcludePath().add("C:\\Program Files (x86)");
            config.getExcludePath().add("C:\\Program Files");
            config.getExcludePath().add("C:\\ProgramData");
        }else{
            config.getExcludePath().add("/tmp");
            config.getExcludePath().add("/etc");
            config.getExcludePath().add("root");
        }
    }

    /**
     * 建立索引的路径
     */
    private Set<String> includePath = new HashSet<>();

    /**
     * 排除索引文件的路径
     */
    private Set<String> excludePath = new HashSet<>();

    //TODO 可配置的参数会在这里体现

    /**
     * H2数据库文件路径
     */
    private String h2IndexPath = System.getProperty("user.dir")+ File.separator+"small_everything";
    public static SmallEverythingConfig getInstance(){
        if(config == null){
            synchronized (SmallEverythingConfig.class){
                if(config == null){
                    config = new SmallEverythingConfig();
                }
            }
        }
        return config;
    }
}

