
������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��
С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ�������5ƿ��
�������£�����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ��
�ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ�
�����Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ� 

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int count = 0;
            while(n >= 3){
                //�ܹ�����������
                int num = n / 3;
                //��ƿ�Ӹ���
                int data = n % 3;
                count += num;
                //ʣ��Ŀ�ƿ�Ӹ���
                n = num + data;
            }
            if(n == 2){
                count++;
            }
            System.out.println(count);
        }
    }
}