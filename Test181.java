
��ƻ��

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(count(num));
        }
    }
    public static int count(int num){
        //һ��Ҫ��ż������С��6,10����ż��������
        if(num%2!=0 || num==10 || num<6){
            return -1;
        }
        //�����8���պ�����
        if(num % 8 == 0){
            return num/8;
        }
        //��ʱ��Ҫ��ǰ���1����������8��ȡ��2��ƻ������������Ϊ6
        return num/8+1;
    }
}