
public class test{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,1,3,3,4,4,5,5};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("只出现一次的数为："+arr[i]);
            }
        }
    }
}