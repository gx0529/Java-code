
��N��������ɴﵽ1000������������

��������:
�����һ��Ϊһ������N��(1<=N<=100)��
��������N��ÿ����һ���������ĳ��ȷ�ΧΪ1<=len<=1000��
ÿ��������һ�����������ұ�֤������ǰ׺�㡣

�������:
�����ж���������ݣ�����ÿ�����ݣ���������N������С�����������
��������Ľ����ÿ����ռһ�С�


import java.util.*;
import java.math.*;

public class Test3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            BigInteger[] num = new BigInteger[N];
            for(int i=0; i<N; i++){
                num[i] = in.nextBigInteger();
            }
            Arrays.sort(num);
            for(BigInteger s : num){
                System.out.println(s);
            }
        }
    }
}