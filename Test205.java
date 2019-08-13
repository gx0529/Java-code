


A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,
但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 
这四个数值.每个字母代表每个人所拥有的糖果数.

现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。
这里保证最多只有一组整数A,B,C满足所有题设条件。

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int A = (a+c)/2;
            int B = (b+d)/2;
            int C = (d-b)/2;
            if((A-B==a) && (B-C==b) && (A+B==c) && (B+C==d)){
                System.out.println(A+" "+B+" "+C);
            }else{
                System.out.println("No");
            }
        }
    }
}