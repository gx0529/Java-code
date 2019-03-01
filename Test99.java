
쳲���������ͨ���� F(n) ��ʾ���γɵ����г�Ϊ쳲��������С�
�������� 0 �� 1 ��ʼ�������ÿһ�����ֶ���ǰ���������ֵĺ͡�Ҳ���ǣ�

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), ���� N > 1.
���� N������ F(N)��

 

ʾ�� 1��
���룺2
�����1
���ͣ�F(2) = F(1) + F(0) = 1 + 0 = 1.

ʾ�� 2��
���룺3
�����2
���ͣ�F(3) = F(2) + F(1) = 1 + 1 = 2.

ʾ�� 3��
���룺4
�����3
���ͣ�F(4) = F(3) + F(2) = 2 + 1 = 3.

class Solution {
    public int fib(int N) {
        if(N < 1){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        return fib(N-1)+fib(N-2);
    }
}


class Solution {
    public int fib(int N) {
        if(N == 0){
            return 0;
        }
        if(N < 3 && N > 0){
            return 1;
        }
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i=3; i<=N; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return sum;
    }
}