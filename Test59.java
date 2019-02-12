package www.bit.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows行
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int[][] array = new int[numRows][numRows];
        for(int i=0; i<numRows; i++){
            List<Integer> l = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(j == 0){
                    array[i][j] = 1;
                }else if(j == i){
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
                l.add(array[i][j]);
            }
            list.add(l);
        }
        return list;
    }
}
public class Test2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(5);
    }
}














