
机器人走方格


有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。
请设计一个算法，计算机器人有多少种走法。

给定两个正整数int x,int y，请返回机器人的走法数目。
保证x＋y小于等于12。

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