
��Ŀ����
��һֻ���ӣ��ӳ������3������ÿ���¶���һֻ���ӣ�С���ӳ����������º�ÿ��������һֻ���ӣ�
�������Ӷ���������ÿ���µ���������Ϊ���٣�

��������:
����int�ͱ�ʾmonth

�������:
�����������int��


import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int result = fun(n);
            System.out.println(result);
        }
    }
    public static int fun(int num) {
        if(num==0)
            return 0;
        else if(num == 1)
            return 1;
        else
            return fun(num-1)+fun(num-2);
    }
}

