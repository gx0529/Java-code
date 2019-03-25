package Nvk;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 某个红包金额出现的次数超过红包总数的一半，求该红包的金额
 * eg：
 * 输入：{1,2,3,2,2},5
 * 输出：2
 */

public class RedPaper {

    public static void main(String[] args) {

        System.out.println(getValue(new int[]{10,12,12,12,13},5));
    }

    //使用Map
    public static int getValue(int[] gifts, int n)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            if(!map.containsKey(gifts[i]))
                map.put(gifts[i], 1);
            else {
                int number=map.get(gifts[i]).intValue();
                number++;
                if(number>n/2) {
                    return gifts[i];
                }
                map.put(gifts[i],number);
            }
        }
        return 0;
    }

    //最易理解
    public static int getValue2(int[] gifts, int n){
        if(n==0){
            return 0;
        }
        for(int i=0; i<n/2; i++){
            int count = 0;
            for(int j=i; j<n; j++) {
                if (gifts[i] == gifts[j]) {
                    count++;
                }
                if (count>n/2){
                    return gifts[i];
                }
            }
        }
        return 0;
    }


    public static int getValue1(int[] gifts, int n) {
        Arrays.sort(gifts);
        int[] data = new int[gifts[n-1]+1];
        int len = n/2;
        for(int i=0; i<n; i++){
            int tmp = gifts[i];
            data[tmp]++;
        }

        for(int i=0; i<data.length; i++){
            if(data[i]>len){
                return i;
            }
        }
        return 0;
    }

}
