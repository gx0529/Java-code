
�����ڼ�С��ʹ��΢���յ��ܶ��������ǳ����ġ�
�ڲ鿴��ȡ�����¼ʱ���֣�ĳ����������ֵĴ��������˺��������һ�롣
���С���ҵ��ú����д�������㷨˼·�ʹ���ʵ�֣�Ҫ���㷨�����ܸ�Ч��
����һ������Ľ������gifts�����Ĵ�Сn���뷵���������Ľ�
��û�н���������һ�룬����0��

����������
	[1,2,3,2,2],5
	���أ�2

import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int data = gifts[n/2];
        int count = 0;
        for(int i=0; i<n; i++){
            if(gifts[i] == data){
                count++;
            }
        }
        return count>n/2 ? data : 0;
    }
}


public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        for(int i=0; i<gifts.length; i++){
            int count = 0;
            for(int j=i; j<gifts.length; j++){
                if(gifts[i] == gifts[j]){
                    count++;
                }
            }
            if(count > gifts.length/2){
                return gifts[i];
            }
        }
        return 0;
    }
}