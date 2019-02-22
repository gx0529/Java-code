package com.bittech.Single;

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
