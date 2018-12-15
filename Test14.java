package www.bit.java;

/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * 示例 1:
 * 输入: "abab"
 * 输出: True
 * 解释: 可由子字符串 "ab" 重复两次构成。
 *
 * 示例 2:
 * 输入: "aba"
 * 输出: False
 *
 * 示例 3:
 * 输入: "abcabcabcabc"
 * 输出: True
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char[] chars = s.toCharArray();
        char first = chars[0];
        String subStr = "";
        for(int i=1;i<chars.length;i++){
            if(chars[i] == first){
                subStr = s.substring(0,i);
                if(judgeRep(s,subStr)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean judgeRep(String s,String sub){
        if(s.length() % sub.length() != 0)
            return false;
        int group = s.length()/sub.length();
        String temp = "";
        for(int j=0; j<group; j++){
            temp = temp + sub;
        }
        if(temp.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Test2{
    public static void main(String[] args) {
        String str = "abaababaab";
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern(str));

    }
}
