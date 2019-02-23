
//客户端

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket cilent = null;
        Scanner readFromServer = null;
        PrintStream writeWsgToServer = null;
        try {
            //与服务端建立连接
            cilent = new Socket("127.0.0.1",6666);
            //取得输入输出流
            readFromServer = new Scanner(cilent.getInputStream());
            writeWsgToServer = new PrintStream(cilent.getOutputStream(),true,"UTF-8");
            //向服务端发送消息
            writeWsgToServer.println("I am Cilent");
            readFromServer.useDelimiter("\n");
            System.out.print("服务端发送的消息为：");
            if(readFromServer.hasNext()){
                System.out.println(readFromServer.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cilent.close();
            readFromServer.close();
            writeWsgToServer.close();
        }
    }
}

//服务器

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        Scanner readFromCilent = null;
        PrintStream writeWsgToCilent = null;
        try {
            server = new ServerSocket(6666);
            //等待客户端的连接
            System.out.println("等待客户端的连接");
            Socket cilent = server.accept();
            System.out.println("新的客户端的端口号为："+cilent.getPort());
            //取得输入输出流
            readFromCilent = new Scanner(cilent.getInputStream());
            writeWsgToCilent = new PrintStream(cilent.getOutputStream());
            System.out.print("客户端发送的消息为：");
            if(readFromCilent.hasNext()){
                System.out.println(readFromCilent.nextLine());
            }
            readFromCilent.useDelimiter("\n");
            writeWsgToCilent.println("I am Server");
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            server.close();
            readFromCilent.close();
            writeWsgToCilent.close();
        }
    }
}