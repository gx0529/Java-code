

��Ҫ��


����С����һ��W*H��������ӣ�������б��Ϊ0~H-1��������б��Ϊ0~W-1��
ÿ������������Է�һ�鵰�⣬�������鵰���ŷ����þ��벻�ܵ���2��

����������������(x1,y1),(x2,y2)��ŷ����þ���Ϊ:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) )
 ������ƽ����
С����֪�������ԷŶ��ٿ鵰������������

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int W = in.nextInt();
            int H = in.nextInt();
            int h1Count = (H/4)*2 + (H%4<2 ? H%4:2);
            int h2Count = ((H-2)/4*2) + ((H-2)%4<2 ? (H-2)%4:2);
            int sum = (W/4) * (h1Count+h2Count)*2;
            if(W%4 == 1){
                sum += h1Count;
            }
            if(W%4 == 2){
                sum += h1Count*2;
            }
            if(W%4 == 3){
                sum += (h1Count*2 + h2Count);
            }
            System.out.println(sum);
        }
    }
}