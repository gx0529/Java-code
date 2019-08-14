

不要二


二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。
每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。

对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) )
 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。

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