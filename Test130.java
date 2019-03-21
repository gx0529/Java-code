

package www.bit.java;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            s = stringExchange(s);
            System.out.println("压缩后的字符串为："+s);
            String str = s;
            str = reduce(str);
            System.out.println("解压后的字符串为："+str);
        }
    }

    public static String stringExchange(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int count;
        for(int i=0; i<s.length(); i=i+count) {
            char cs = s.charAt(i);
            count = 1;
            int j;
            for(j = i+1; j<s.length(); j++) {
                char ce = s.charAt(j);
                if(ce == cs) {
                    count++;
                }else{
                    break;
                }
            }
            stringBuilder.append(String.valueOf(cs)).append(String.valueOf(count));
        }
        return stringBuilder.toString();
    }

    public static String reduce(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<str.length()-1; i=i+2){
            char cs = str.charAt(i);
            int count = str.charAt(i+1)-'0';
            for(int j=0; j<count; j++){
                stringBuilder.append(String.valueOf(cs));
            }
        }
        return stringBuilder.toString();
    }
}