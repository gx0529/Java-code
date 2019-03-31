/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 示例 1: 输入: 27, 输出: true
 * 示例 2: 输入: 0, 输出: false
 * 示例 3: 输入: 9, 输出: true
 * 示例 4: 输入: 45, 输出: false
 */
public class LeetCode326 {
    public static void main(String[] args){
        int n = 45;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        int ret = n;
        while(ret>2){
            if(ret%3 == 0){
                ret = ret/3;
            }else{
                return false;
            }
        }
        if(ret == 1){
            return true;
        }
        return false;
    }
}
