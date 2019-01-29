﻿package www.bit.java;

import java.util.Arrays;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 *
 * 示例 2:
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 *
 * 示例 3:
 * 输入: 218
 * 输出: false
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
//        if(n <= 0){
//            return false;
//        }
//        while(n > 1){
//            if(n % 2 != 0){
//                return false;
//            }
//            else{
//                n = n/2;
//            }
//        }
//        return n==1;
        return n>0 && (n & n-1)==0;
    }
}

public class Test2{
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(8));
    }
}








