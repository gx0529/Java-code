package www.bit.java;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] nums = new int[length];
        int i = 0;
        for(i=length-1; i>=0; i--){
            if(digits[i]+1 > 9){
                nums[i] = 0;
                continue;
            }else{
                int j = i;
                nums[j] = digits[j]+1;
                for(j=j-1; j>=0; j--){
                    nums[j] = digits[j];
                }
                break;
            }
        }
        if(i == -1){
            int c = length+1;
            int[] tmp = new int[c];
            tmp[0] = 1;
            return tmp;
        }
        return nums;
    }
}
public class Test2{
    public static void main(String[] args){
        int[] digits = new int[]{9,9};
        Solution solution = new Solution();
        solution.plusOne(digits);
    }
}










