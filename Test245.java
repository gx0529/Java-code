
�෴��


Ϊ�˵õ�һ������"�෴��",���ǽ������������˳��ߵ�,Ȼ���ټ���ԭ�ȵ����õ�"�෴��"��
����,Ϊ�˵õ�1325��"�෴��",�������ǽ�����������˳��ߵ�,���ǵõ�5231,֮���ټ���ԭ�ȵ���,
���ǵõ�5231+1325=6556.����ߵ�֮���������ǰ׺��,ǰ׺�㽫�ᱻ���ԡ�
����n = 100, �ߵ�֮����1.

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            int num = Integer.parseInt(str);
            StringBuffer s = new StringBuffer(str);
            str = s.reverse().toString();
            int data = Integer.parseInt(str);
            System.out.println(num+data);
        }
    }
}