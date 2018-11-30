package www.bit.java;


class Solution {
    public int[] sortArrayByParityII(int[] A) {
        for(int i=0; i<A.length; i++){
            if(i % 2 == 0){
                if(A[i] % 2 != 0){
                    for(int j=i+1; j<A.length; j++){
                        if(A[j] % 2 == 0){
                            Swap(A,i,j);
                            break;
                        }
                    }
                }
            }else{
                if(A[i] % 2 == 0){
                    for(int j=i+1; j<A.length; j++){
                        if(A[j] % 2 != 0){
                            Swap(A,i,j);
                            break;
                        }
                    }
                }
            }
        }
        return A;
    }
    public void Swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
public class Test2{
    public static void main(String[] args) {
        int[] data = new int[]{4,2,5,7};
        Solution solution = new Solution();
        int[] A = solution.sortArrayByParityII(data);
        for(int tmp : A){
            System.out.println(tmp);
        }

    }
}