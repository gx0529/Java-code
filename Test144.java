import java.util.ArrayList;
import java.util.List;

/**
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。
 * 例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * 示例 1：
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * 提示：
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * 如果 A.length > 1，那么 A[0] != 0
 */
public class LeetCode989 {
    public static void main(String[] args){
        int[] nums = new int[]{9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> list = addToArrayForm(nums, k);
        System.out.println(list);
    }
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int i = 0;
        for(int j=A.length-1; j>=0; j--){
            int temp = (int)Math.pow(10,j);
            int ret = (A[i] * temp);
            sum = sum + ret;
            i++;
        }
        sum = sum + K;
        int ret1 = sum;
        int ret2 = sum;
        int count = 0;
        while(ret1>0){
            ret1 = ret1/10;
            count++;
        }
        for(int j=count-1; j>=0; j--){
            int temp = (int)Math.pow(10,j);
            list.add(ret2/temp);
            ret2 = ret2%temp;
        }
        return list;
    }
}
