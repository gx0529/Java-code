package www.bit.java;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 *给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: 6
 *
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: 24
 */
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(nums[len-1]<0) {
            return nums[len - 1] * nums[len - 2] * nums[len - 3];
        }
        int a = nums[len-1]*nums[len-2]*nums[len-3];
        int b = nums[len-1]*nums[0]*nums[1];
        return a > b ? a : b;
    }
}

public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = new int[]{1,2,3,4};
        int result = solution.maximumProduct(data);
        System.out.println(result);
    }
}
