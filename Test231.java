
ϴ��


ϴ����������ʮ�ֳ�����������Ҫдһ������ģ��ϴ�ƵĹ��̡� ������Ҫϴ2n���ƣ�
���ϵ��������ǵ�1�ţ���2�ţ���3��һֱ����2n�š����ȣ����ǰ���2n���Ʒֳ����ѣ�
�������ŵ�1�ŵ���n�ţ��ϰ�ѣ����������ŵ�n+1�ŵ���2n�ţ��°�ѣ������žͿ�ʼϴ�ƵĹ��̣�
�ȷ������ֵ����һ���ƣ��ٷ������ֵ����һ���ƣ����ŷ������ֵĵ����ڶ����ƣ�
�ٷ������ֵĵ����ڶ����ƣ�ֱ�����������ֵĵ�һ���ơ����Ű��ƺϲ������Ϳ����ˡ� 
������6���ƣ��ʼ�Ƶ�������1,2,3,4,5,6�����ȷֳ����飬��������1,2,3����������4,5,6��
��ϴ�ƹ����а�˳�������6,3,5,2,4,1�������������ٴκϳ�һ����֮��
���ǰ��մ������µ�˳�������ƣ��ͱ��������1,4,2,5,3,6�� ���ڸ���һ��ԭʼ���飬
������⸱��ϴ��k��֮��������µ����С�


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] data = new int[2*n];
            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();
            String str = new String();
            for(int i=0; i<2*n; i++){
                data[i] = in.nextInt();
            }
            while(k > 0){
                for(int i=0; i<n; i++){
                    stack1.push(data[i]);
                }
                for(int i=n; i<2*n; i++){
                    stack2.push(data[i]);
                }
                int j = 2*n-1;
                for(int i=0; i<n; i++){
                    data[j--] = stack2.pop();
                    data[j--] = stack1.pop();
                }
                k--;
            }
            System.out.print(data[0]);
            for(int i=1; i<2*n; i++){
                System.out.print(" "+data[i]);
            }
            System.out.println();
        }
    }
}