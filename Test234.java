
����֮��

���ڸ����������� n��������ʮ������ʽ������λ������֮�ͣ���������ƽ���ĸ�λ����֮�͡�

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(sum(n)+" "+sum(n*n));
        }
    }
    public static int sum(int num){
        String str = String.valueOf(num);
        int length = str.length();
        int data = 0;
        for(int i=0; i<length; i++){
            data += str.charAt(i)-'0';
        }
        return data;
    }
}