package www.bit.java;


import java.io.*;

public class Test2{
    public static void main(String[] args) throws IOException {
        //1.取得终端对象
        File file = new File("C:"+File.separator+"Users"+
                File.separator+"Administrator"+File.separator+"Desktop"+
                File.separator+"Test.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //2.取得File对象的输出流
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file,true);
            //3.进行数据的输出
            String msg = "Java3班IO课程\r\n";
            outputStream.write(msg.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //4.关闭流
            outputStream.close();
        }
    }
}