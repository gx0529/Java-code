
Ѱ�ҵ�K��

/**
��һ���������飬������ݿ��������˼·���ҳ������е�K������� 
����һ����������a,ͬʱ�������Ĵ�Сn��Ҫ�ҵ�K(K��1��n֮��)���뷵�ص�K���������֤�𰸴��ڡ�
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



import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n-1, K);
    }
    public int findKth(int[] a, int left, int right, int K){
        int data = standard(a, left, right);
        if(K == right-data+1){
            return a[data];
        }else if(K > right-data+1){
            return findKth(a, left, data-1, K-right+data-1);
        }else{
            return findKth(a, data+1, right, K);
        }
    }
    public int standard(int[] a, int left, int right){
        int begin = left;
        int end = right;
        int key = a[right];
        while(begin < end){
            while(begin<end && a[begin]<=key){
                begin++;
            }
            if(begin == end){
                break;
            }
            a[end] = a[begin];
            while(begin<end && a[end]>key){
                end--;
            }
            if(begin == end){
                break;
            }
            a[begin] = a[end];
        }
        a[begin] = key;
        return begin;
    }
}