
����һ�������ľ��������̣������һ����Ч�㷨�жϵ�ǰ����Ƿ��ʤ��
����һ����ά����board������ǰ���̣�����Ԫ��Ϊ1�Ĵ����ǵ�ǰ��ҵ����ӣ�
Ϊ0��ʾû�����ӣ�Ϊ-1�����ǶԷ���ҵ����ӡ�

����������
	[[1,0,1],[1,-1,-1],[1,-1,0]]
	���أ�true

import java.util.*;

public class Board {
    public boolean checkWon(int[][] board) {
        for(int i=0; i<board.length; i++){
            if(board[i][0]==1 && board[i][0]==board[i][1] && board[i][1]==board[i][2]){
                return true;
            }
            if(board[0][i]==1 && board[0][i]==board[1][i] && board[1][i]==board[2][i]){
                return true;
            }
        }
        if(board[0][0]==1 && board[1][1]==board[0][0] && board[1][1]==board[2][2]){
            return true;
        }
        if(board[0][2]==1 && board[0][2]==board[1][1] && board[1][1]==board[2][0]){
            return true;
        }
        return false;
    }
}