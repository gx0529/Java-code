


���ַ���


����һϵ�����������밴Ҫ������ֽ��з��࣬���������5�����֣�




A1 = �ܱ�5����������������ż���ĺͣ�


A2 = ����5������1�����ְ�����˳����н�����ͣ�������n1-n2+n3-n4...��


A3 = ��5������2�����ֵĸ�����


A4 = ��5������3�����ֵ�ƽ��������ȷ��С�����1λ��


A5 = ��5������4��������������֡�

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int A1 = 0;
            int A2 = 0;
            int A3 = 0;
            double A4 = 0;
            int A5 = 0;
            int flag = 1;
            int count = 0;  
            for(int i=0; i<n; i++){
                int temp = in.nextInt();
                if(temp%5==0 && (temp/5)%2==0){
                    A1 += temp;
                }else if(temp%5 == 1){
                    A2 += temp*flag;
                    flag *= (-1);
                }else if(temp%5 == 2){
                    A3++;
                }else if(temp%5 == 3){
                    count++;
                    A4 += temp;
                }else{
                    A5 = Math.max(temp,A5);
                }
            }
            if(A1 == 0){
                System.out.print("N ");
            }else{
                System.out.print(A1+" ");
            }
            if(A2 == 0){
                System.out.print("N ");
            }else{
                System.out.print(A2+" ");
            }
            if(A3 == 0){
                System.out.print("N ");
            }else{
                System.out.print(A3+" ");
            }
            if(count == 0){
                System.out.print("N");
            }else{
                System.out.print(String.format("%.1f",A4/count));
            }
            if(A5 == 0){
                System.out.print(" N");
            }else{
                System.out.print(" "+A5);
            }
        }
    }
}