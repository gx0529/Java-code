
�������������

�����һ���㷨������������������ļӷ���

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