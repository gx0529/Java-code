package www.bit.java;

import java.util.Arrays;

/**
 *给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 * 输入: [3,0,1]
 * 输出: 2
 *
 * 示例 2:
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 */
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        int i=0;
        for(i=0; i<nums.length-1; i++){
            if((nums[i+1] - nums[i]) != 1){
                break;
            }
        }
        return nums[i]+1;
    }
}

public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3,0,1};
        System.out.println(solution.missingNumber(nums));
    }
}