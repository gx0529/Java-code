


从C/C++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。
C语言风格使用下划线分隔多个单词，例如“hello_world”；
而Java则采用一种叫骆驼命名法的规则：除首个单词以外，所有单词的首字母大写，
例如“helloWorld”。
请你帮可怜的程序员们自动转换变量名。

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String[] str1 = str.split("_");
            if(str1.length > 1){
                for(int i=1; i<str1.length; i++){
                    str1[i] = str1[i].substring(0,1).toUpperCase() + str1[i].substring(1);
                }
            }
            StringBuilder s = new StringBuilder();
            for(int i=0; i<str1.length; i++){
                s.append(str1[i]);
            }
            System.out.println(s);
        }
    }
}