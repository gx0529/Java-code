


数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int data = array[array.length/2];
        int count = 0;
        for(int num : array){
            if(num == data){
                count++;
            }
        }
        if(count > array.length/2){
            return data;
        }
        return 0;
    }
}