package www.bit.java;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 */
class Solution {
    public int lengthOfLastWord(String s) {
        char[] carray = s.trim().toCharArray();
        int count = 0;
        for(int i=0;i<carray.length;i++){
            if(!String.valueOf(carray[carray.length-1-i]).equals(" ")){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}

public class Test2{
    public static void main(String[] args) {
        String str = "Hello World";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord(str));

    }
}
