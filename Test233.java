


ѧ�ּ���


������ѧ�Ա������ĳɼ�ʩ��ƽ��ѧ�ּ����ƣ�GPA����
�Ƚ�ѧ����ʵ�ʿ��ָ��ݲ�ͬ��ѧ�ƵĲ�ͬѧ�ְ�һ���Ĺ�ʽ���м��㡣 
��ʽ���£� ʵ�ʳɼ� ���� 90����100 4.0 85����89 3.7 82����84 3.3 78����81 3.0 
75����77 2.7 72����74 2.3 68����71 2.0 64����67 1.5 60����63 1.0 60���� 0 
1��һ�ſγ̵�ѧ�ּ���=�ÿμ���*�ÿ�ѧ�� 
2����������=����ѧ�Ƽ���֮��/���пγ�ѧ��֮�� ��Ҫ�����д�������ĳ��A���������㣨GPA����


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int[] data = new int[n];
            int[] score = new int[n];
            double[] num = new double[n];
            for(int i=0; i<n; i++){
                data[i] = in.nextInt();
            }
            for(int i=0; i<n; i++){
                score[i] = in.nextInt();
            }
            double m = 0;
            int sum = 0;
            for(int i=0; i<n; i++){
                if(score[i]>=90 && score[i]<=100){
                    num[i] = 4.0;
                }
                if(score[i]>=85 && score[i]<=89){
                    num[i] = 3.7;
                }
                if(score[i]>=82 && score[i]<=84){
                    num[i] = 3.3;
                }
                if(score[i]>=78 && score[i]<=81){
                    num[i] = 3.0;
                }
                if(score[i]>=75 && score[i]<=77){
                    num[i] = 2.7;
                }
                if(score[i]>=72 && score[i]<=74){
                    num[i] = 2.3;
                }
                if(score[i]>=68 && score[i]<=71){
                    num[i] = 2.0;
                }
                if(score[i]>=64 && score[i]<=67){
                    num[i] = 1.5;
                }
                if(score[i]>=60 && score[i]<=63){
                    num[i] = 1.0;
                }
                if(score[i]<60){
                    num[i] = 0;
                }
                m += data[i]*num[i];
                sum += data[i];
            }
            System.out.printf("%.2f",m/sum);
        }
    }
}