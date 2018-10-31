/**
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。
 */

public class perfectNumber{
    public static void main(String[] args){
        int i,j;
        int num = 0;
        for(i=1; i<=1000; i++){
            num = 0;
            for(j=1; j<=i/2; j++){
                //判断是否为这个数的因子
                if(i%j == 0){
                    num = num+j;
                }
            }
            //判断一个数是否等于因子之和
            if(i == num){
                System.out.print(i+" ");
            }
        }
    }
}