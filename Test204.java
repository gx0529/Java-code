
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        if(k > input.length){
            return list;
        } else{
            for(int i=0; i<k; i++){
                list.add(input[i]);
            }
            return list;
        }
    }
}