


������ֵ����

����һ������ΪN(N>1)����������A�����Խ�A���ֳ������������֣��󲿷�A[0..K]��
�Ҳ���A[K+1..N-1]��K����ȡֵ�ķ�Χ��[0,N-2]������ô�໮�ַ����У�
�󲿷��е����ֵ��ȥ�Ҳ������ֵ�ľ���ֵ������Ƕ��٣�


������������A������Ĵ�Сn���뷵����Ŀ����Ĵ𰸡�

import java.util.*;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max = A[0];
        for(int i=0; i<n; i++){
            max = Math.max(max,A[i]);
        }
        return Math.max(max-A[0],max-A[n-1]);
    }
}