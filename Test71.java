package www.bit.java;


class Sort{
    public void BubbleSort(int[] array, int size){
        int flag = 0;
        for(int i=0; i<size-1; i++){
            for(int j=1; j<size-i; j++){
                if (array[j - 1] > array[j]) {
                    Swap(array, j-1, j);
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }

    public void Swap(int[] array, int left, int right){
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}

public class Test2{
    public static void main(String[] args) {
        int[] array = new int[]{2,0,4,9,3,6,8,7,1,5};
        Sort sort = new Sort();
        Print(array);
        sort.BubbleSort(array,array.length);
        System.out.println();
        Print(array);
    }
    public static void Print(int[] array){
        for(int tmp : array){
            System.out.print(tmp + " ");
        }
    }
}













