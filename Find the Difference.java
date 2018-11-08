package www.bit.java.util;
/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */

class Solution {
    public char findTheDifference(String s, String t) {
        char tmp = 0x00;
        //将字符串转换为字符数组
        char[] data1 = s.toCharArray();
        char[] data2 = t.toCharArray();
        //根据两个相同的值异或为0求出添加的字符
        for(int i=0; i<data1.length; i++){
            tmp = (char)(tmp ^ data1[i]);
        }
        for(int j=0; j<data2.length; j++){
            tmp = (char)(tmp ^ data2[j]);
        }
        return tmp;
    }
}
public class Test1{
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abecd";
        System.out.println(new Solution().findTheDifference(s,t));
    }
}


