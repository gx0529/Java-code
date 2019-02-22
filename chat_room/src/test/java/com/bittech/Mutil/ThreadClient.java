package com.bittech.Mutil;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 读取服务器发来信息的线程
 */
class ReadFromServerThread implements Runnable{
    private Socket client;
    //通过构造方法传入通信的Socket
    public ReadFromServerThread(Socket client) {
        this.client = client;
    }
    @Override
    public void run() {
        Scanner in = null;
        try {
            //获取客户端的输入流，读取服务器发来的信息
            in = new Scanner(client.getInputStream());
            //碰到回车在换行
            in.useDelimiter("\n");
            //不断获取服务器信息
            while(true){
                if(in.hasNextLine()){
                    System.out.println("从服务器发来的消息为："+in.nextLine());
                }
                //此客户端退出
                if(client.isClosed()){
                    System.out.println("客户端已关闭");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}


class WriteToServerThread implements Runnable{
    private Socket client;

    public WriteToServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        //获取键盘输入,向服务器发送信息
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        PrintStream out = null;
        try {
            //获取客户端输出流，向服务器发送信息
            out = new PrintStream(client.getOutputStream(),true,"UTF-8");
            while(true){
                System.out.println("请输入要发送的消息...");
                String strToServer;
                if(scanner.hasNextLine()){
                    strToServer = scanner.nextLine();
                    out.println(strToServer);
                    //客户端退出标志
                    if(strToServer.contains("byebye")){
                        System.out.println("关闭客户端");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();
            out.close();
        }
    }
}


public class ThreadClient {
    public static void main(String[] args) {
        try {
            //建立与服务器的连接
            Socket client = new Socket("127.0.0.1",6666);
            //创建读写线程与服务器通信
            Thread readFromServer = new Thread(new ReadFromServerThread(client));
            Thread writeToServer = new Thread(new WriteToServerThread(client));
            readFromServer.start();
            writeToServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
