
�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
�������ַ���ģ�����ָ���������������һ���������ַ�����S��
�������ѭ������Kλ������������
���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
�ǲ��Ǻܼ򵥣�OK���㶨����

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0 || str.length()==1){
            return str;
        }
        int num = n % str.length();
        String s = str.s    ubstring(0,num);
        str = str.substring(num) + s;
        return str;
    }
}