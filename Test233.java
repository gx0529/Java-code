


学分绩点


北京大学对本科生的成绩施行平均学分绩点制（GPA）。
既将学生的实际考分根据不同的学科的不同学分按一定的公式进行计算。 
公式如下： 实际成绩 绩点 90——100 4.0 85——89 3.7 82——84 3.3 78——81 3.0 
75——77 2.7 72——74 2.3 68——71 2.0 64——67 1.5 60——63 1.0 60以下 0 
1．一门课程的学分绩点=该课绩点*该课学分 
2．总评绩点=所有学科绩点之和/所有课程学分之和 现要求你编写程序求出某人A的总评绩点（GPA）。


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