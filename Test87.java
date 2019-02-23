
//�ͻ���

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
            //�����˽�������
            cilent = new Socket("127.0.0.1",6666);
            //ȡ�����������
            readFromServer = new Scanner(cilent.getInputStream());
            writeWsgToServer = new PrintStream(cilent.getOutputStream(),true,"UTF-8");
            //�����˷�����Ϣ
            writeWsgToServer.println("I am Cilent");
            readFromServer.useDelimiter("\n");
            System.out.print("����˷��͵���ϢΪ��");
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

//������

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
            //�ȴ��ͻ��˵�����
            System.out.println("�ȴ��ͻ��˵�����");
            Socket cilent = server.accept();
            System.out.println("�µĿͻ��˵Ķ˿ں�Ϊ��"+cilent.getPort());
            //ȡ�����������
            readFromCilent = new Scanner(cilent.getInputStream());
            writeWsgToCilent = new PrintStream(cilent.getOutputStream());
            System.out.print("�ͻ��˷��͵���ϢΪ��");
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