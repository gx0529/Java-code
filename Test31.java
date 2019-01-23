

/**
 * ����һ������ n������ n! ���β�������������
 *
 * ʾ�� 1:
 * ����: 3
 * ���: 0
 * ����: 3! = 6, β����û���㡣
 *
 * ʾ�� 2:
 * ����: 5
 * ���: 1
 * ����: 5! = 120, β������ 1 ����.
 */

class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        long t = 5;
        while(t <= n){
            sum += n/t;
            t *= 5;
        }
        return sum;
    }
}