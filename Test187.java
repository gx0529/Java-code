


��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��

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