


��Ʊͳ��


��������:

�����ѡ�˵�������
�ڶ��������ѡ�˵����֣�
����������ͶƱ�˵�������
����������ͶƱ��





�������:
ÿ�������ѡ�˵����ֺ͵�Ʊ������



ʾ��1

����

4

A B C D

8

A B C D E F G H


���

A : 1

B : 1

C : 1

D : 1

Invalid : 4

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            String[] s = new String[n];
            Map<String,Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                String temp = in.next();
                map.put(temp,0);
                s[i] = temp;
            }
            int num = in.nextInt();
            Set<String> keys = map.keySet();
            int count = 0;
            for(int i=0; i<num; i++){
                String str = in.next();
                if(keys.contains(str)){
                    map.put(str,map.get(str)+1);
                }else{
                    count++;
                }
            }
            for(int i=0; i<n; i++){
                System.out.println(s[i]+" : "+map.get(s[i]));
            }
            System.out.println("Invalid"+" : "+count);
        }
    }
}