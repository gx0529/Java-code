
˵����

����һ��Ӣ�Ҫ�����д���򣬽��������е��ʵ�˳��ߵ������

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