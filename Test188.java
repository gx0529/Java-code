


��C/C++ת��Java�ĳ���Ա��һ��ʼ�ϰ�ߵľ��Ǳ���������ʽ�ĸı䡣
C���Է��ʹ���»��߷ָ�������ʣ����硰hello_world����
��Java�����һ�ֽ������������Ĺ��򣺳��׸��������⣬���е��ʵ�����ĸ��д��
���硰helloWorld����
���������ĳ���Ա���Զ�ת����������

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