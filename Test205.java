


A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,
��������֪�����µ���Ϣ��
A - B, B - C, A + B, B + C. 
���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.

������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C��
���ﱣ֤���ֻ��һ������A,B,C������������������

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int A = (a+c)/2;
            int B = (b+d)/2;
            int C = (d-b)/2;
            if((A-B==a) && (B-C==b) && (A+B==c) && (B+C==d)){
                System.out.println(A+" "+B+" "+C);
            }else{
                System.out.println("No");
            }
        }
    }
}