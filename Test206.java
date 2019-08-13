
输入n个整数，输出出现次数大于等于数组长度一半的数。

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String data = in.nextLine();
            String[] temp = data.split(" ");
            int[] num = new int[temp.length];
            for(int i=0; i<temp.length; i++){
                num[i] = Integer.parseInt(temp[i]);
            }
            Arrays.sort(num);
            System.out.println(num[num.length/2-1]);
        }
    }
}