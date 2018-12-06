package www.bit.java;

/**
 *给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 */
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++){
            result[(j+k)%nums.length] = nums[i];
            j++;
        }
//        k = k % nums.length;
//        while(k>0){
//            int temp = nums[nums.length-1];
//            for(int i=nums.length-1; i>0; i--){
//                nums[i] = nums[i-1];
//            }
//            nums[0] = temp;
//            k--;
//        }
        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }
        for(int temp:nums){
            System.out.print(temp+" ");
        }
    }
}
public class Test2{
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new Solution().rotate(nums,3);
    }
}
