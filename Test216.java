
���°���һ����



������ͳ�°��������������˶�ѧϰ��̣��������������д���룬
��Ϊ������ʷ����λ��д������������ͳ��
2014��ף�Ϊ��ף������

����ѧ�����ܡ���ʽ������
�°����д�˺ܼ򵥵ļ�������룺����Ļ�ϻ�һ�������Ρ�������Ҳ����һ�𻭰ɣ�

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int m = n/2 + n%2;
            String c = in.nextLine();
            c = c.trim();
            for(int i=0; i<n; i++){
                System.out.print(c);
            }
            System.out.println();
            for(int i=1; i<m-1; i++){
                System.out.print(c);
                for(int k=1; k<n-1; k++){
                    System.out.print(" ");
                }
                System.out.println(c);
            }
            for(int i=0; i<n; i++){
                System.out.print(c);
            }
        }
    }
}