package www.bit.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 示例:
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * 输出:
 * [5,6]
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                int temp = nums[i];
                if (temp == nums[temp - 1]) {
                    continue;
                }
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
                i--;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}

public class Test2{
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        Solution solution = new Solution();
        solution.findDisappearedNumbers(nums);
    }
}










