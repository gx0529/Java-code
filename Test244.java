


��������


��Ŀ����
С����һ������Ϊn����������,a_1,...,a_n��Ȼ������һ��������b�Ͻ���n�����²���:
1����a_i����b���е�ĩβ
2������b����
С����Ҫ������������n��֮���b���С�


import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if(n < 2){
                return;
            }
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = in.nextInt();
            }
            StringBuffer str = new StringBuffer();
            for(int i=n-1; i>=0; i-=2){
                str.append(data[i]+" ");
            }
            for(int i=n%2; i<n; i+=2){
                str.append(data[i]+" ");
            }
            System.out.println(str);
        }
    }
}