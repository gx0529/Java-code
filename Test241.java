



进制转换

写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            int length = str.length()-2;
            double b = 0;
            for(int i=2; i<str.length(); i++){
                char c = str.charAt(i);
                int temp = 0;
                if(c>='A' && c<='F'){
                    temp = c-'A'+10;
                }else if(c>='a' && c<='f'){
                    temp = c-'a'+10;
                }else{
                    temp = c-'0';
                }
                b += (temp*Math.pow(16,length-1));
                length--;
            }
            System.out.println((long)b);
        }
    }
}