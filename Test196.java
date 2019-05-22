寻找第K大

/**
有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。 
给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static int findKth(int[] a, int n, int K) {
        return findKth(a,0,n-1,K);
    }
    public static int findKth(int[] a, int low, int high, int k){
        int part = partation(a,low,high);
        if(k == part - low + 1){
            return a[part];
        } else if(k > part - low + 1) {
            return findKth(a, part+1,high,k-part+low-1);
        } else {
            return findKth(a,low,part-1,k);
        }
    }
    public static int partation(int[] a, int low, int high){
        int key = a[low];
        while(low < high){
            while(low < high && a[high] <= key){
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] >= key){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        System.out.println(findKth(a,5,3));
    }
}