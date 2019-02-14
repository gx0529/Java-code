package www.bit.java;


class Sort{
    public void SelectSort(int[] array, int size){
        for(int i=0; i<size; i++){
            int maxPos = 0;
            for(int j=1; j<size-i; j++){
                if(array[j] > array[maxPos]){
                    maxPos = j;
                }
            }
            if(maxPos != size-1-i){
                Swap(array, maxPos, size-1-i);
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
        sort.SelectSort(array,array.length);
        System.out.println();
        Print(array);
    }
    public static void Print(int[] array){
        for(int tmp : array){
            System.out.print(tmp + " ");
        }
    }
}














