
�������߷���


��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ�
�����һ���㷨������������ж������߷���

��������������int x,int y���뷵�ػ����˵��߷���Ŀ��
��֤x��yС�ڵ���12��

import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        int[][] F = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(i == 0){
                    F[i][j] = 1;
                }else if(j == 0){
                    F[i][j] = 1;
                }else{
                    F[i][j] = F[i-1][j] + F[i][j-1];
                }
            }
        }
        return F[x-1][y-1];
    }
}