


�Ӵ��ж�

����һ��СдӢ����ĸ��ɵ��ַ���s��һ�������϶�СдӢ���ַ���������p��
�����һ����Ч�㷨������p�е�ÿһ���϶��ַ������ж����Ƿ�Ϊs���Ӵ���



����һ��string����p�����Ĵ�Сn��ͬʱ����string s��Ϊĸ�����뷵��һ��bool���飬
ÿ��Ԫ�ش���p�еĶ�Ӧ�ַ����Ƿ�Ϊs���Ӵ�����֤p�еĴ�����С�ڵ���8��
��p�еĴ��ĸ���С�ڵ���500��ͬʱ��֤s�ĳ���С�ڵ���1000��

import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] b = new boolean[n];
        for(int i=0; i<n; i++){
            b[i] = s.contains(p[i]);
        }
        return b;
    }
}