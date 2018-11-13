package www.bit.java.util;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 */
class Solution {
    public String reverseString(String s) {
        //先将字符串转为数组
        char[] data = s.toCharArray();
        //定义一个与原来字符串长度相等的数组
        char[] temp = new char[data.length];
        for(int i=data.length-1,j=0; i>=0; i--){
            //把源数组的数据从后往前依次赋给新数组
            temp[j++] = data[i];
        }
        //将目标数组转为字符串返回
        return new String(temp);
    }
}
public class Test1{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseString("hello"));
    }
}



