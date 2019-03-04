
题目描述

编写程序，读入一个整数N。若N为非负数，则计算N 到2N 之间的整数和；
若N为一个负数，则求2N 到N 之间的整数和。

输入描述:

第一行表示样例数m，接下来m行每行一个整数N，N的绝对值不超过100。

输出描述:

输出m行，每行表示对应的题目所求。


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] n = new int[m];
        for(int i=0;i<m;i++){
            n[i] = sc.nextInt();
        }
        fun(n);
    }
    public static void fun(int[] n){
        for(int i=0; i<n.length; i++){
            int result = 0;
            if(n[i]==0){
                 
            }
            if(n[i]>0){
                for(int j=n[i];j<=2*n[i];j++){
                    result += j;
                }
            }
            if(n[i]<0){
                for(int j=2*n[i];j<=n[i];j++){
                    result += j;
                }
            }
            System.out.println(result);  
        }
    }
}