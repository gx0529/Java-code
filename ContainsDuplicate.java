package www.bit.java.util;
/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，
 * 并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //通过遍历数组来判断元素是否相等
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                //利用Math.abs(int a)来判断绝对值
                if(nums[i] == nums[j] && (Math.abs(i-j)<=k)){
                    return true;
                }
            }
        }
        return false;
    }
}

public class Test1{
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,2,3};
        System.out.println(new Solution().containsNearbyDuplicate(nums, 2));
    }
}



