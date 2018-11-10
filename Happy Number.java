package www.bit.java.util;

class Solution {
    public boolean isHappy(int n) {
        while(true){
            int flag = getNext(n);
            if(flag == 1){
                return true;
            }else{
                n = flag;
                if(n == 89){
                    return false;
                }
            }
        }
    }
    public int getNext(int num){
        int result = 0;
        result = result+((num%10)*(num%10));
        num = num/10;
        if(num == 0){
            return result;
        }else{
            return result+getNext(num);
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19));
    }
}


