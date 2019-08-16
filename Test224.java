


小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn. 
如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
并且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,
但他的能力值只能增加bi 与c的最大公约数.
那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int a = in.nextInt();
            for(int i=0; i<n; i++){
                int b = in.nextInt();
                if(b <= a){
                    a = a + b;
                }else{
                    a = a + max(a, b);
                }
            }
            System.out.println(a);
        }
    }
    public static int max(int a, int b){
        while(a > 0){
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}