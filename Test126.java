���ɸ�����

��һ�����ı����У��������������ڵĴ���ֻ��һλ����������ͬ�� 
������ֱ���Ϊ������(Gray Code)�����дһ��������ʹ�õݹ�ķ�������Nλ�ĸ����롣
����һ������n���뷵��nλ�ĸ����룬˳��Ϊ��0��ʼ��

����������
	1
	���أ�["0","1"]


import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        if(n == 1){
            String[] result = new String[2];
            result[0] = "0";
            result[1] = "1";
            return result;
        }else{
            String[] temp = getGray(n-1);
            String[] result = new String[temp.length * 2];
            for(int i=0; i<temp.length; i++){
                result[i] = "0" + temp[i];
            }
            for(int i=0; i<temp.length; i++){
                result[i+temp.length] = "1" + temp[temp.length-1-i];
            }
            return result;
        }
    }
}