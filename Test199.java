
��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
�������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
n<=39

public class Solution {
    public int Fibonacci(int n) {
        if(n <= 0){
            return 0;
        }
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i=2; i<=n; i++){
            F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }
}