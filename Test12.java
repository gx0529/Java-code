package www.bit.java;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */
class Solution {
    public int firstUniqChar(String s) {
        if(s == "" || s == null) {
            return -1;
        }
        int[] record = new int[26];
        char[] ch = s.toCharArray();
        for(char c:ch){
            record[c - 'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(record[ch[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

public class Test2{
    public static void main(String[] args) {
        String str = "cc";
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar(str));
    }
}
