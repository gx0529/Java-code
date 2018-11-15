package www.bit.java.util;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
class Solution {
    public boolean isPalindrome(int x) {
        String str = ""+x;
        char[] data = str.toCharArray();
        char[] arr = new char[data.length];
        for(int i = 0; i < data.length; i++){
            arr[data.length-1-i] = data[i];
        }
        String str2 = new String(arr);
        if(str.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
}

public class Test1{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}



