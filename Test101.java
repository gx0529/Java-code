
题目描述

请编写一个程序，从键盘上输入n（n 的范围是1～20），求n 的阶乘。

输入描述:
输入第一行为样例数m，接下来m行每行一个整数n，n不超过20。

输出描述:
输出m行表示对应的n的阶乘。

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] x= new int[m];
        long y = 1;
        int i =0;
        for(i=0; i<m; i++) {
            x[i] = in.nextInt();
        }
        for(int j=0;j<m;j++) {
            int k= x[j];
            for (i = 0;i<k;i++) {
                y=y*x[j];
                x[j]--;
            }
            System.out.println(y);
            y=1;
        }
    }
}