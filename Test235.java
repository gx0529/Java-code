


计票统计


输入描述:

输入候选人的人数，
第二行输入候选人的名字，
第三行输入投票人的人数，
第四行输入投票。





输出描述:
每行输出候选人的名字和得票数量。



示例1

输入

4

A B C D

8

A B C D E F G H


输出

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