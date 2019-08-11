删除公共字符
输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String A = in.nextLine();
            String B = in.nextLine();
            StringBuffer C = new StringBuffer();
            for(int i=0; i<A.length(); i++){
                int j = 0;
                for(j=0; j<B.length(); j++){
                    if(A.charAt(i) == B.charAt(j)){
                        break;
                    }
                }
                if(j == B.length()){
                    C = C.append(A.charAt(i));
                }
            }
            System.out.println(C.toString());
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String A = in.nextLine();
            String B = in.nextLine();
            for(int i=0; i<A.length(); i++){
                if(!(B.contains(String.valueOf(A.charAt(i))))){
                    System.out.print(A.charAt(i));
                }
            }
        }
    }
}