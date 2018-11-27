package www.bit.java;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * 示例 1：输入：16，输出：True
 * 示例 2：输入：14，输出：False13
 */
public class Test2 {
    public static void main(String[] args){
        int num = 2147395600;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }else if(num == 0 || num == 1){
            return true;
        }
        for(int i=1; i<=num/2; i++){
            if(num == i*i){
                return true;
            }
        }
        return false;
    }
}

