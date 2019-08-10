
读入一个字符串str，输出字符串str中的连续最长的数字串

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            char[] arr = str.toCharArray();
            String max = "";
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= '0' && arr[i] <= '9'){
                    String str1 = new String();
                    for(int j=i; j<arr.length; j++){
                        if(!(arr[j] >= '0' && arr[j] <= '9')){
                            break;
                        }
                        str1 = str1 + arr[j];
                    }
                    i += str1.length();
                    if(max.length() < str1.length()){
                        max = str1;
                    }
                }
            }
            System.out.println(max);
        }
    }
}