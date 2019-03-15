
对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。
例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。

给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。

 

示例 1：
	输入：A = [1,2,0,0], K = 34
	输出：[1,2,3,4]
	解释：1200 + 34 = 1234
示例 2：
	输入：A = [2,7,4], K = 181
	输出：[4,5,5]
	解释：274 + 181 = 455
示例 3：
	输入：A = [2,1,5], K = 806
	输出：[1,0,2,1]
	解释：215 + 806 = 1021
示例 4：
	输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
	输出：[1,0,0,0,0,0,0,0,0,0,0]
	解释：9999999999 + 1 = 10000000000


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(K);
        int temp = 0;
        for(int i=A.length-1; i>=0; i--) {
            int num = A[i] + K % 10 + temp;
            temp = num / 10;
            list.add(num % 10);
            K = K / 10;
        }
        while (K > 0){
            int num = K % 10 + temp;
            list.add(num % 10);
            temp = num / 10;
            K = K / 10;
        }
        if(temp == 1){
            list.add(1);
        }
        Collections.reverse(list);
        return list;
    }
}