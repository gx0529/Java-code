
相反数


为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。
例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,
我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。
例如n = 100, 颠倒之后是1.

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            int num = Integer.parseInt(str);
            StringBuffer s = new StringBuffer(str);
            str = s.reverse().toString();
            int data = Integer.parseInt(str);
            System.out.println(num+data);
        }
    }
}