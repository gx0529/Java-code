
һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
�����������һ��n����̨���ܹ��ж�����������

public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 0){
            return 0;
        }
        int[] F = new int[target+1];
        F[1] = 1;
        for(int i=2; i<=target; i++){
            F[i] = 2 * F[i-1];
        }
        return F[target];
    }
}