package www.bit.java;

import java.util.Arrays;

/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 * 输入: a = 1, b = 2
 * 输出: 3
 *
 * 示例 2:
 * 输入: a = -2, b = 3
 * 输出: 1
 */
class Solution {
    public int getSum(int a, int b) {
        return b==0 ? a : getSum(a^b, (a&b)<<1);
    }
}

public class Test2{
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.getSum(1,2));
    }
}









