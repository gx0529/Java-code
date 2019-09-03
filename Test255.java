package www.bit.java;

import java.util.*;


// 找出数组中和为1的对数
public class Test3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            StringBuffer str1 = new StringBuffer();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) != ' '){
                    str1.append(str.charAt(i));
                }
            }
            str = str1.toString();
            String[] s = str.split(",");
            int[] data = new int[s.length];
            for(int i=0; i<s.length; i++){
                int c = Integer.parseInt(s[i]);
                data[i] = c;
            }
            Arrays.sort(data);
            int count = 0;
            int left = 0;
            int right = data.length-1;
            while(left < right){
                if(data[left]+data[right] == 0){
                    count++;
                    left++;
                    right--;
                }else if(data[left]+data[right] < 0){
                    left++;
                }else{
                    right--;
                }
            }
            System.out.println(count);
        }
    }
}