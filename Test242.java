
球的半径和体积

输入球的中心点和球上某一点的坐标，计算球的半径和体积
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int z0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int z1 = in.nextInt();
            double num = Math.pow(x1-x0,2)+Math.pow(y1-y0,2)+Math.pow(z1-z0,2);
            double r = Math.pow(num,1.0/2);
            double PI = Math.acos(-1);
            System.out.format("%.3f %.3f",r,4/3.0*PI*Math.pow(r,3));
        }
    }
}