

�����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ���
�����ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ������յ�ʱ�����õ���������ֱ����ַ���A���ַ���B��
�������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ���
����ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ���
����ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��

���磺
A = ��aba����B = ��b����
������4�ְ�B����A�İ취��

* ��A�ĵ�һ����ĸ֮ǰ: "baba" ���ǻ���

* �ڵ�һ����ĸ��a��֮��: "abba" �ǻ��� 

* ����ĸ��b��֮��: "abba" �ǻ��� 

* �ڵڶ�����ĸ'a'֮�� "abab" ���ǻ��� 
�������������Ĵ�Ϊ2

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int count = 0;
            String A = in.nextLine();
            String B = in.nextLine();
            for(int i=0; i<A.length(); i++){
                String str = A.substring(0,i)+B+A.substring(i);
                if(isHuiWen(str)){
                    count++;
                }
            }
            String str = A + B;
            if(isHuiWen(str)){
                count++;
            }
            System.out.println(count);
        }
    }
    public static boolean isHuiWen(String str){
        StringBuffer str1 = new StringBuffer(str);
        return str.equals(str1.reverse().toString());
    }
}