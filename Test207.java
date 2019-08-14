求最小公倍数

正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
设计一个算法，求输入A和B的最小公倍数。

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int A = in.nextInt();
            int B = in.nextInt();
            int max = Math.max(A,B);
            int min = Math.min(A,B);
            for(int i=1; i<=min; i++){
                int count = max*i;
                if(count % min == 0){
                    max = count;
                    break;
                }
            }
            System.out.println(max);
        }
    }
}