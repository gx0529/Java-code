
找X

输入一个数n，然后输入n个数值各不相同，再输入一个值x，
输出这个值在这个数组中的下标（从0开始，若不在数组中则输出-1）。

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = in.nextInt();
            }
            int num = in.nextInt();
            for(int i=0; i<n; i++){
                if(num == data[i]){
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}