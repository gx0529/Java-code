
句子逆序

将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
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