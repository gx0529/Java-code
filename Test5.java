package www.bit.java;
import java.io.File;

public class Test2{
    public static void main(String[] args) {
        //取得File对象
        File file = new File("C:"+File.separator+"Users"+
                File.separator+"Administrator"+File.separator+"Desktop");
        System.out.println("遍历文件开始...");
        long start = System.currentTimeMillis();
        listAllFiles(file);
        long end = System.currentTimeMillis();
        System.out.println("遍历文件结束..."+(end-start)+"毫秒");
    }
    public static void listAllFiles(File file){
        if(file.exists() && file.isFile()){
            System.out.println(file);
        }else{
            //此时File对象为路径
            File[] files = file.listFiles();
            if(file != null){
                for(File file1 : files){
                    listAllFiles(file1);
                }
            }
        }
    }
}