
超长正整数相加

请设计一个算法完成两个超长正整数的加法。

import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String A = in.nextLine();
            String B = in.nextLine();
            BigInteger num1 = new BigInteger(A);
            BigInteger num2 = new BigInteger(B);
            System.out.println(num1.add(num2));
        }
    }
}