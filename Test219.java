�����С��




��������0-9�����ɸ��������������˳��������Щ���֣�������ȫ��ʹ�á�
Ŀ����ʹ�����õ�����������С��ע��0��������λ����
���磺

��������0������1������5��һ��8�����ǵõ�����С��������10015558��

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int[] data = new int[10];
            StringBuffer str = new StringBuffer();
            for(int i=0; i<10; i++){
                data[i] = in.nextInt();
                for(int j=0; j<data[i]; j++){
                    str.append(i);
                }
            }
            char[] num = str.toString().toCharArray();
            if(num[0] == '0'){
                for(int i=1; i<num.length; i++){
                    if(num[i] != '0'){
                        num[0] = num[i];
                        num[i] = '0';
                        break;
                    }
                }
            }
            System.out.println(String.valueOf(num));
        }
    }
}