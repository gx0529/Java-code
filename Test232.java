


数字分类


给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：




A1 = 能被5整除的数字中所有偶数的和；


A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；


A3 = 被5除后余2的数字的个数；


A4 = 被5除后余3的数字的平均数，精确到小数点后1位；


A5 = 被5除后余4的数字中最大数字。

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int A1 = 0;
            int A2 = 0;
            int A3 = 0;
            double A4 = 0;
            int A5 = 0;
            int flag = 1;
            int count = 0;  
            for(int i=0; i<n; i++){
                int temp = in.nextInt();
                if(temp%5==0 && (temp/5)%2==0){
                    A1 += temp;
                }else if(temp%5 == 1){
                    A2 += temp*flag;
                    flag *= (-1);
                }else if(temp%5 == 2){
                    A3++;
                }else if(temp%5 == 3){
                    count++;
                    A4 += temp;
                }else{
                    A5 = Math.max(temp,A5);
                }
            }
            if(A1 == 0){
                System.out.print("N ");
            }else{
                System.out.print(A1+" ");
            }
            if(A2 == 0){
                System.out.print("N ");
            }else{
                System.out.print(A2+" ");
            }
            if(A3 == 0){
                System.out.print("N ");
            }else{
                System.out.print(A3+" ");
            }
            if(count == 0){
                System.out.print("N");
            }else{
                System.out.print(String.format("%.1f",A4/count));
            }
            if(A5 == 0){
                System.out.print(" N");
            }else{
                System.out.print(" "+A5);
            }
        }
    }
}