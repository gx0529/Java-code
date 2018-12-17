package www.bit.java;

/**
 * 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。
 * 如果没有两个连续的 1，返回 0 。
 */

class Solution {
    public int binaryGap(int N) {
        int[] data = new int[32];  //最多就32位
        int k = 0;
        for(int i = 0; i < 32; i++){
            if(((N >> i) & 1) == 1)
                data[k++] = i;
        }
        int res = 0;
        for(int i = 0; i < k-1; i++){
            res = Math.max(res,data[i+1]-data[i]);
        }
        return res;
    }
}


