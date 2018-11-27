package www.bit.java;

/**
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1：输入: 4，输出: 2
 * 示例 2：输入: 8，输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 */
public class Test2 {
    public static void main(String[] args){
        int num = 2147483647;
        System.out.println(mySqrt(num));
    }
    public static int mySqrt(int x) {
        int k = 0;
        if(x<0){
            return -1;
        }else if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }
        for(int i=1; i<=x/2; i++){
            long m = (i+1L)*(i+1L);
            if(m<Integer.MAX_VALUE){
                if(x == i*i){
                    k = i;
                    break;
                }else if(x>i*i && x<(i+1)*(i+1)){
                    k = i;
                    break;
                }
            }else{
                k=i;
                break;
            }
        }
        return k;
    }
}


