import java.util.*;


二维数组打印

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] print = new int[n*n];
        int index = 0;
        for(int i=0;i<n;i++){
           for(int j=0;j<i+1;j++){
              print[index] = arr[j][n-i-1+j];
              index++;
          }
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                print[index] = arr[i+j][j];
                    index++;
                }
            }
        return print;
    }
}