
��������

��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�


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