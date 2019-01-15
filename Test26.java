package www.bit.java;

import java.util.Arrays;

/**
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 * 示例 1：
 * 输入：[2,1,2]
 * 输出：5
 *
 * 示例 2：
 * 输入：[1,2,1]
 * 输出：0
 *
 * 示例 3：
 * 输入：[3,2,3,4]
 * 输出：10
 *
 * 示例 4：
 * 输入：[3,6,2,3]
 * 输出：8
 */
class Solution {
    public int largestPerimeter(int[] A) {
        if(A==null || A.length<3){
            return 0;
        }
        int max = 0;
        Arrays.sort(A);
        int sum = 0;
        for(int i=2; i<A.length; i++){
            sum = A[i]+A[i-1]+A[i-2];
            if(A[i]*2 < sum){
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}

public class Test2{
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] A = new int[]{2,1,2};
        System.out.println(solution.largestPerimeter(A));
    }
}









