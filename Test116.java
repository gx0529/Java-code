/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 注意:
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1: 输入: 5, 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2: 输入: 1, 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 */
public class LeetCode476 {
    public static void main(String[] args){
        int num = 1;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        int result = 0;
        if(num == 0){
            return 0;
        }
        int n = num, x = 0;
        for(int i = 0; i<32; i++){
            if(num == 0){
                break;
            }
            n = num&1;
            x = (int) Math.pow(2,i);
            result = result + negation(n)*x;
            num = num>>1;
        }
        return result;
    }
    public static int negation(int num){
        if(num == 0){
            return 1;
        }
        return 0;
    }
}
