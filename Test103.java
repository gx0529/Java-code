
��Ŀ����

��д���򣬶���һ������N����NΪ�Ǹ����������N ��2N ֮��������ͣ�
��NΪһ������������2N ��N ֮��������͡�

��������:

��һ�б�ʾ������m��������m��ÿ��һ������N��N�ľ���ֵ������100��

�������:

���m�У�ÿ�б�ʾ��Ӧ����Ŀ����


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] n = new int[m];
        for(int i=0;i<m;i++){
            n[i] = sc.nextInt();
        }
        fun(n);
    }
    public static void fun(int[] n){
        for(int i=0; i<n.length; i++){
            int result = 0;
            if(n[i]==0){
                 
            }
            if(n[i]>0){
                for(int j=n[i];j<=2*n[i];j++){
                    result += j;
                }
            }
            if(n[i]<0){
                for(int j=2*n[i];j<=n[i];j++){
                    result += j;
                }
            }
            System.out.println(result);  
        }
    }
}