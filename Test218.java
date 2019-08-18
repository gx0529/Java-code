
尼科彻斯定理

验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。

例如：

1^3=1 

2^3=3+5 

3^3=7+9+11 

4^3=13+15+17+19 

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int m = in.nextInt();
            int n = m*(m-1) + 1;
            int tmp = n;
            for(int i=0; i<m-1; i++){
                System.out.print(tmp+"+");
                tmp += 2;
            }
            System.out.println(tmp);
        }
    }
}