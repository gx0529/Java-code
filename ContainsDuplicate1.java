package www.bit.java.util;
/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    //只要有元素相等，count就++
                    count++;
                }
            }
            //只要一个数组中有重复元素，则count一定不等于0，直接返回
            if(count>0){
                return true;
            }
        }
        //如果整个数组都遍历完，count一直等于0，则一定没有重复元素
        return false;
    }
}

public class Test1{
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(new Solution().containsDuplicate(nums));
    }
}



