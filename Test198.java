
��

С��ȥ�������̵���ƻ������թ���̷�ʹ���������ף�
ֻ�ṩ6��ÿ����8��ÿ���İ�װ(��װ���ɲ��)�� 
����С������ֻ�빺��ǡ��n��ƻ����С���빺�����ٵĴ�������Я����
������ܹ���ǡ��n��ƻ����С�׽����Ṻ��

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            System.out.println(num(n));
        }
    }
    public static int num(int n){
        if(n%8==0){
            return n/8;
        } else if(n%8==4 || n%8==6 || n%8==2){
            return n/8+1;
        } else{
            return -1;
        }
    }
}