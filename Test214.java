
�����˻�����

��

����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����

import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i=0; i<A.length; i++){
            B[i] = 1;
        }
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                if(i != j){
                    B[i] *= A[j];
                }
            }
        }
        return B;
    }
}


import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length !=  0){
            B[0] = 1;
            for(int i=1; i<length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            for(int j=length-2; j>=0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
}