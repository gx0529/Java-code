


��λ��ͳ��


����һ��kλ����N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)��
���д����ͳ��ÿ�ֲ�ͬ�ĸ�λ���ֳ��ֵĴ��������磺����N = 100311������2��0��3��1����1��3��

����
100311
���
0:2
1:3
3:1


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            char[] tmp = str.toCharArray();
            int[] data = new int[10];
            for(int i=0; i<str.length(); i++){
                int num = str.charAt(i)-'0';
                data[num]++;
            }
            for(int i=0; i<10; i++){
                if(data[i] > 0){
                    System.out.println(i+":"+data[i]);
                }
            }
        }
    }
}