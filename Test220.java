ͳ��ͬ�ɼ�ѧ������




����N��ѧ���ĳɼ��������ĳһ����������ѧ�����������



��������:

��������������ɲ���������ÿ�����������ĸ�ʽΪ



��1�У�N

��2�У�N��ѧ���ĳɼ���������������һ���ո�����

��3�У���������

������N=0ʱ���������
����N������1000���ɼ�����Ϊ��������0��100֮���һ��������




�������:
��ÿ����������������ø���������ѧ�����������

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            if(N == 0){
                return;
            }
            int[] data = new int[N];
            for(int i=0; i<N; i++){
                data[i] = in.nextInt();
            }
            int score = in.nextInt();
            int count = 0;
            for(int num : data){
                if(num == score){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}