
Fibonacci��������������ģ�
F[0] = 0
F[1] = 1
for each i �� 2: F[i] = F[i-1] + F[i-2]

��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ...��
��Fibonacci�����е������ǳ�ΪFibonacci����
����һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1��
���ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci����

import java.util.*;

public class Main{ 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int a = 0;
            int b = 1;
            while(b <= n)
                int c = a+b;
                a = b;
                b = c;
            }
            System.out.print(Math.min(n-a,b-n));
        }
    }
}