ɾ��

��һ������a[N]˳����0~N-1��Ҫ��ÿ��������ɾ��һ��������ĩβʱѭ������ͷ�������У�
�����һ����ɾ��������ԭʼ�±�λ�á�
��8����(N=7)Ϊ��:��0��1��2��3��4��5��6��7����0->1->2(ɾ��)->3->4->5(ɾ��)->6->7->0(ɾ��),
���ѭ��ֱ�����һ������ɾ����
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if(n > 999){
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(i);
            }
            int i=0;
            while(list.size() > 1){
                i = (i+2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}