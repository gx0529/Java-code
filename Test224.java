


С�׾���������������Ϸ.��һ��,������һ�������������Ϸ,���Ľ�ɫ�ĳ�ʼ����ֵΪ a.
�ڽ�������һ��ʱ����,��������������n������,ÿ������ķ�����Ϊb1,b2,b3...bn. 
��������Ĺ��������biС�ڵ���С�׵ĵ�ǰ����ֵc,��ô���������ɴ�ܹ���,
����ʹ���Լ�������ֵ����bi;���bi����c,����Ҳ�ܴ�ܹ���,
����������ֵֻ������bi ��c�����Լ��.
��ô��������,��һϵ�еĶ�����,С�׵���������ֵΪ����?

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int a = in.nextInt();
            for(int i=0; i<n; i++){
                int b = in.nextInt();
                if(b <= a){
                    a = a + b;
                }else{
                    a = a + max(a, b);
                }
            }
            System.out.println(a);
        }
    }
    public static int max(int a, int b){
        while(a > 0){
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}