package www.bit.java;

/**
 * 给定一组字符，使用原地算法将其压缩。
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 在完成原地修改输入数组后，返回数组的新长度。
 *
 * 示例 1：
 * 输入：
 * ["a","a","b","b","c","c","c"]
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 *
 * 示例 2：
 * 输入：
 * ["a"]
 * 输出：
 * 返回1，输入数组的前1个字符应该是：["a"]
 *
 * 示例 3：
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 输出：
 * 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 */
class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;

        int count = 1, result = 0, temp = 0, cursor = 1;
        while (cursor < chars.length){
            if (chars[cursor] == chars[temp]) {
                count++;
                cursor++;
            } else {
                if (count == 1) {
                    chars[result] = chars[temp];
                    result++;
                    temp = cursor;
                    count = 1;
                    cursor++;
                } else if (count > 9) {
                    chars[result] = chars[temp];
                    char[] aaa = Integer.toString(count).toCharArray();
                    for (char a : aaa) {
                        result++;
                        chars[result] = a;
                    }
                    result++;
                    temp = cursor;
                    count = 1;
                    cursor++;
                } else {
                    chars[result] = chars[temp];
                    result++;
                    chars[result] = (char) (count + 48);
                    result++;
                    temp = cursor;
                    count = 1;
                    cursor++;
                }
            }
        }

        if (count > 9) {
            chars[result] = chars[chars.length - 1];
            char[] aaa = Integer.toString(count).toCharArray();
            for (char a : aaa) {
                result++;
                chars[result] = a;
            }
            return result + 1;
        } else if (count > 1) {
            chars[result] = chars[chars.length - 1];
            result++;
            chars[result] = (char) (count + 48);
            return result + 1;
        } else {
            chars[result] = chars[chars.length - 1];
            return result + 1;
        }
    }
}

public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(solution.compress(chars));
    }
}









