
说反话

给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str1 = in.nextLine();
            String[] str = str1.split(" ");
            StringBuffer s = new StringBuffer();
            for(int i=str.length-1; i>0; i--){
                s.append(str[i]).append(" ");
            }
            s.append(str[0]);
            System.out.println(s);
        }
    }
}