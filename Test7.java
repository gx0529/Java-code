package www.bit.java;


import java.io.*;

public class Test2{
    public static void main(String[] args) throws IOException {
        //1.取得FIle对象
        File file = new File("C:"+File.separator+"Users"+
                File.separator+"Administrator"+File.separator+
                "Desktop"+File.separator+"Test.txt");
        //2.取得输入流
        InputStream in = new FileInputStream(file);
        //3.读取文件内容
        byte[] data = new byte[1024];
        int result = in.read(data);
        System.out.println(result);
        System.out.println(new String(data,0,result));
        //4.关闭流
        in.close();
    }
}