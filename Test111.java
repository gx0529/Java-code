package www.bit.java;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 *
 * 示例 2:
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] memo = new int[n];
        // 先考虑最简单的情况
        memo[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // memo[i] 的取值在考虑抢劫 i 号房子和不考虑抢劫之间取最大值
            memo[i] = Math.max(nums[i]+(i+2>=n ? 0:memo[i+2]), nums[i+1]+(i+3>=n ? 0:memo[i+3]));
        }
        return memo[0];
    }
}

public class Test3 {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {2,7,9,4,1};
        System.out.println(solution.rob(nums));
    }
}
