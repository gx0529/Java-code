ͳ�ƻ���
/**
�����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ���
�����ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ������յ�ʱ�����õ���������ֱ����ַ���A���ַ���B��
�������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ���
����ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ���
����ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��
*/

import java.util.*;

public class Main{
    public static boolean HuiWen(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = 0;
        for(int i=0; i <= str1.length(); i++){
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2);
            if(HuiWen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}