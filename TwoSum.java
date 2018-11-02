/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

   你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

   示例:

   给定 nums = [2, 7, 11, 15], target = 9

   因为 nums[0] + nums[1] = 2 + 7 = 9
   所以返回 [0, 1]
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if((nums[i]+nums[j] == target) && (i!=j)){   //判断两个数的相加是否等于给定值，并且两个数的下标不同
                    result[0] = i;     //找到后将下标赋给目标数组
                    result[1] = j;
                    return result;    //因为只有一种答案，所以找到后就直接返回
                }
            }
        }
        return null;
    }
}
public class test{
    public static void main(String[] args){
        int target = 9;
        int[] data = new int[]{2,7,11,15};
        Solution solution = new Solution();
        int[] result = solution.twoSum(data, target);
        for(int temp:result){
            System.out.print(temp+" ");
        }
    }
}