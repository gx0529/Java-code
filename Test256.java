

public class Solution {
    public String replaceSpace(StringBuffer str) {
    	String s = str.toString();
        char[] s1 = s.toCharArray();
        int count = 0;
        for(int i=0; i<s1.length; i++){
            if(s1[i] == ' '){
                count++;
            }
        }
        char[] s2 = new char[s1.length+2*count];
        int len = s1.length-1;
        for(int i=s2.length-1; i>=0; ){
            if(s1[len] == ' '){
                len--;
                s2[i--] = '0';
                s2[i--] = '2';
                s2[i--] = '%';
            }else{
                s2[i] = s1[len];
                i--;
                len--;
            }
        }
        return new String(s2);
    }
}