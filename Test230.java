
��X

����һ����n��Ȼ������n����ֵ������ͬ��������һ��ֵx��
������ֵ����������е��±꣨��0��ʼ�������������������-1����

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = in.nextInt();
            }
            int num = in.nextInt();
            for(int i=0; i<n; i++){
                if(num == data[i]){
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}