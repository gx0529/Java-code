package www.bit.java;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 */
class Solution {
    public int reverse(int x) {
        try {
            if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
                return 0;
            } else {
                String str = String.valueOf(x);
                StringBuilder stringBuilder = new StringBuilder();
                if (str.startsWith("-")) {
                    stringBuilder.append(str.substring(1, str.length()));
                    str = str.substring(0, 1) + stringBuilder.reverse().toString();
                    return Integer.parseInt(str);
                } else if (str.startsWith("0") && str.length() > 1) {
                    stringBuilder.append(str.substring(1, str.length()));
                    str = stringBuilder.reverse().toString();
                    return Integer.parseInt(str);
                } else {
                    stringBuilder.append(str);
                    str = stringBuilder.reverse().toString();
                    return Integer.parseInt(str);
                }
            }
        } catch (Exception e) {
            return 0;
        }
    }
}

public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = -123;
        System.out.println(solution.reverse(num));
    }
}



