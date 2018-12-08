package www.bit.java;

import java.util.Arrays;

/**
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，
 * 其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 * 示例:
 *
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] data = new int[len];//保存前几个元素之和
        int num=1;
        for (int i = 0; i < len-1; i++) {  //求前几个元素之和
            num = num * nums[i];
            data[i] = num;
        }

        int temp=1;//代表后几个元素之和
        for (int i=len-1; i>=0 ; i--) {
            if(i >0){
                data[i]=temp * data[i-1];
            }else {
                data[i]=temp;//此时，a代表了最终答案
            }
            temp *= nums[i];
        }
        return data;
    }
}

public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4};
        solution.productExceptSelf(nums);
    }
}