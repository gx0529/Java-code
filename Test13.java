package www.bit.java;

/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
class Solution {
    public int countSegments(String s) {
        int sum = 0;
        int flag = 0;

        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == ' ')
                flag = 0;
            if(ch != ' ' && flag == 0)
            {
                sum++;
                flag = 1;
            }

        }
        return sum;
    }
}
public class Test2{
    public static void main(String[] args) {
        String str = "";
        Solution solution = new Solution();
        System.out.println(solution.countSegments(str));
    }
}
