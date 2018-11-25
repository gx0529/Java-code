package www.bit.java;

/**
 *我们把符合下列属性的数组 A 称作山脉：
 *
 *A.length >= 3
 *存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 *
 *给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 的 i 的值。
 */

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int i=0; i<A.length-1; i++){
            //如果下一个元素小于当前元素，则当前元素为山脉
            if(A[i] > A[i+1]){
                return i;
            }
        }
        //要是前面都不满足条件，则只有可能是最后一个元素
        return A.length-1;
    }
}
public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{0,1,0};
        System.out.println(solution.peakIndexInMountainArray(A));
    }
}
