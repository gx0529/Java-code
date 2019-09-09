

import java.util.*;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0){
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(i);
        }
        int k = 0;
        while(list.size() > 1){
            k = k + m - 1;
            k = k%list.size();
            list.remove(k);
        }
        return list.get(0);
    }
}