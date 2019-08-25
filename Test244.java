


操作序列


题目描述
小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
1、将a_i放入b序列的末尾
2、逆置b序列
小易需要你计算输出操作n次之后的b序列。


import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if(n < 2){
                return;
            }
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = in.nextInt();
            }
            StringBuffer str = new StringBuffer();
            for(int i=n-1; i>=0; i-=2){
                str.append(data[i]+" ");
            }
            for(int i=n%2; i<n; i+=2){
                str.append(data[i]+" ");
            }
            System.out.println(str);
        }
    }
}