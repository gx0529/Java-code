/**
*����һ������A[0,1,...,n-1],�빹��һ������B[0,1��...��n-1],
*����B�е�Ԫ��B[i] = A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
*/

import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i=0; i<A.length; i++){
            int num = 1;
            for(int j=0; j<A.length; j++){
                if(j == i){
                    continue;
                }
                num = num * A[j];
            }
            B[i] = num;
        }
        return B;
    }
}