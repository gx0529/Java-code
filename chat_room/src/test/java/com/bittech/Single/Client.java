package com.bittech.Single;

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