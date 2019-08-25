


左右最值最大差

给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，左部分A[0..K]，
右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。求这么多划分方案中，
左部分中的最大值减去右部分最大值的绝对值，最大是多少？


给定整数数组A和数组的大小n，请返回题目所求的答案。

import java.util.*;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max = A[0];
        for(int i=0; i<n; i++){
            max = Math.max(max,A[i]);
        }
        return Math.max(max-A[0],max-A[n-1]);
    }
}