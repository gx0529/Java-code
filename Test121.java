
���ڷǸ����� X ���ԣ�X ��������ʽ��ÿλ���ְ������ҵ�˳���γɵ����顣
���磬��� X = 1231����ô��������ʽΪ [1,2,3,1]��

�����Ǹ����� X ��������ʽ A���������� X+K ��������ʽ��

 

ʾ�� 1��
	���룺A = [1,2,0,0], K = 34
	�����[1,2,3,4]
	���ͣ�1200 + 34 = 1234
ʾ�� 2��
	���룺A = [2,7,4], K = 181
	�����[4,5,5]
	���ͣ�274 + 181 = 455
ʾ�� 3��
	���룺A = [2,1,5], K = 806
	�����[1,0,2,1]
	���ͣ�215 + 806 = 1021
ʾ�� 4��
	���룺A = [9,9,9,9,9,9,9,9,9,9], K = 1
	�����[1,0,0,0,0,0,0,0,0,0,0]
	���ͣ�9999999999 + 1 = 10000000000


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