package com.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

@Getter
@ToString
public class SmallEverythingConfig {

    private static volatile SmallEverythingConfig config;

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
     * 检索最大的返回值数量
     */
    @Setter
    private Integer maxReturn = 30;

    /**
     * 深度排序规则，默认是升序
     * order by dept asc limit 30 offset 0
     */
    @Setter
    private Boolean deptOrderAsc = true;

    /**
     * H2数据库文件路径
     */
    private String h2IndexPath =
            System.getProperty("user.dir")+ File.separator+"small_everything";

    private SmallEverythingConfig(){
    }

    //初始化默认路径配置
    private void initDefaultPathsConfig(){
        //1.获取文件系统  windows
        FileSystem fileSystem = FileSystems.getDefault();

        //系统下的磁盘，遍历目录
        Iterable<Path> iterable = fileSystem.getRootDirectories();

        for (Path path : iterable) {
            config.includePath.add(path.toString());
        }

        //排除目录
        //windows : C:\Windows  C:\Program Files (x86)  C:\Program Files  C:\ProgramData
        //linux : /tmp  /etc

        //获取操作系统
        String osname = System.getProperty("os.name");
        if(osname.startsWith("Windows")){
            config.getExcludePath().add("C:\\Windows");
            config.getExcludePath().add("C:\\Program Files (x86)");
            config.getExcludePath().add("C:\\Program Files");
            config.getExcludePath().add("C:\\ProgramData");
        }else{
            config.getExcludePath().add("/tmp");
            config.getExcludePath().add("/etc");
            config.getExcludePath().add("/root");
        }
    }


    public static SmallEverythingConfig getInstance(){
        if(config == null){
            synchronized (SmallEverythingConfig.class){
                if(config == null){
                    config = new SmallEverythingConfig();
                    //遍历目录和排除目录
                    config.initDefaultPathsConfig();
                }
            }
        }
        return config;
    }

}

