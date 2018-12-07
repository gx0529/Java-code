package www.bit.java;

import java.util.Arrays;

/**
 *给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(max < count){
                    max = count;
                }
                count = 0;
            }else{
                count++;
            }
        }
        return max > count ? max : count;
    }
}
public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,0,1,1,1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}