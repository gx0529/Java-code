组个最小数




给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
目标是使得最后得到的数尽可能小（注意0不能做首位）。
例如：

给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int[] data = new int[10];
            StringBuffer str = new StringBuffer();
            for(int i=0; i<10; i++){
                data[i] = in.nextInt();
                for(int j=0; j<data[i]; j++){
                    str.append(i);
                }
            }
            char[] num = str.toString().toCharArray();
            if(num[0] == '0'){
                for(int i=1; i<num.length; i++){
                    if(num[i] != '0'){
                        num[0] = num[i];
                        num[i] = '0';
                        break;
                    }
                }
            }
            System.out.println(String.valueOf(num));
        }
    }
}