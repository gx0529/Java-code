
跟奥巴马一起编程



美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，
成为美国历史上首位编写计算机代码的总统。
2014年底，为庆祝“计算

机科学教育周”正式启动，
奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            int m = n/2 + n%2;
            String c = in.nextLine();
            c = c.trim();
            for(int i=0; i<n; i++){
                System.out.print(c);
            }
            System.out.println();
            for(int i=1; i<m-1; i++){
                System.out.print(c);
                for(int k=1; k<n-1; k++){
                    System.out.print(" ");
                }
                System.out.println(c);
            }
            for(int i=0; i<n; i++){
                System.out.print(c);
            }
        }
    }
}