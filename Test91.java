
����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��

˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���

ʾ�� 1:

����: "A man, a plan, a canal: Panama"
���: true
ʾ�� 2:

����: "race a car"
���: false

class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return true;
        }
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for(char c : s.toCharArray()){
            if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')){
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}