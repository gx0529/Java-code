
����n���������ҳ�������С��K������
��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��

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