����һ��СдӢ����ĸ��ɵ��ַ���s��һ�������϶�СдӢ���ַ���������p��
�����һ����Ч�㷨������p�е�ÿһ���϶��ַ������ж����Ƿ�Ϊs���Ӵ���
����һ��string����p�����Ĵ�Сn��ͬʱ����string s��Ϊĸ����
�뷵��һ��bool���飬ÿ��Ԫ�ش���p�еĶ�Ӧ�ַ����Ƿ�Ϊs���Ӵ���
��֤p�еĴ�����С�ڵ���8����p�еĴ��ĸ���С�ڵ���500��ͬʱ��֤s�ĳ���С�ڵ���1000��

����������
	["a","b","c","d"],4,"abc"
	���أ�[true,true,true,false]

import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] temp = new boolean[n];
        for(int i=0; i<n; i++){
            temp[i] = s.contains(p[i]);
        }
        return temp;
    }
}