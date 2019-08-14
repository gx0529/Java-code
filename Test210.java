
输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int sum = 0;
            for(int i=n; i>=5; i--){
                int tmp = i;
                while(tmp % 5 == 0){
                    sum++;
                    tmp /= 5;
                }
            }
            System.out.println(sum);
        }
    }
}