
��һ��ֻ����һ�ε��ַ�

��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.


public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() <= 0){
            return -1;
        }
        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == (str.charAt(j))){
                    count++;
                }
            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
}