����С������

������A��������B ����С��������ָ �ܱ�A��B��������С��������ֵ��
���һ���㷨��������A��B����С��������

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int A = in.nextInt();
            int B = in.nextInt();
            int max = Math.max(A,B);
            int min = Math.min(A,B);
            for(int i=1; i<=min; i++){
                int count = max*i;
                if(count % min == 0){
                    max = count;
                    break;
                }
            }
            System.out.println(max);
        }
    }
}