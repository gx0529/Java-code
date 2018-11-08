package www.bit.java.util;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 */
class Solution {
    public String toLowerCase(String str) {
        //先将字符串转为字符数组
        char[] data = str.toCharArray();
        for(int i=0; i<data.length; i++){
            //通过遍历判断是否为大写字母
            if(data[i]>'A' && data[i]<'Z'){
                data[i] = (char)(data[i]+32);
            }
        }
        return (new String(data));
    }
}
public class Test1{
    public static void main(String[] args) {
        String str = "LOVELY";
        System.out.println(new Solution().toLowerCase(str));
    }
}



