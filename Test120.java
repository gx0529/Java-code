
��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ�
�����һ���㷨������������ж������߷���
��������������int x,int y���뷵�ػ����˵��߷���Ŀ����֤x��yС�ڵ���12��

����������
	2,2
	���أ�2

import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        if(x==0 || y==0){
            return 0;
        }
        if(x==1 || y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }
}