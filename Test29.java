package www.bit.java;

import java.util.Arrays;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * 示例1:
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *
 * 示例2:
 * 输入: 3
 * 输出: False
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)Math.sqrt(c);
        while(i <= j){
            int num = i*i + j*j;
            if(num == c){
                return true;
            }else if(num < c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}

public class Test2{
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.judgeSquareSum(8));
    }
}









