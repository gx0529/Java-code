/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */
class Solution {
    String result = "";
    int k = 0;
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while(i >= 0 && j >= 0){
            int m = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + k;
            num(m);
            i--;
            j--;
        }
        while(i >= 0){
            int m = (num1.charAt(i) - '0') + k;
            num(m);
            i--;
        }
        while(j >= 0){
            int m = (num2.charAt(j) - '0') + k;
            num(m);
            j--;
        }
        if(k > 0){
            return k + result;
        }
        return result;
    }
    public void num(int n){
        if(n >= 10){
            result = (n - 10) + result;
            k = 1;
        }else{
            result = n + result;
            k = 0;
        }
    }
}
public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num1 = "123";
        String num2 = "246";
        System.out.println(solution.addStrings(num1,num2));
    }
}




