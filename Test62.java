package www.bit.java;


class Sort{
    public void InsertSort(int[] array, int size){
        for(int i=1; i<size; i++){
            int key = array[i];
            int end = i-1;
            while(end >= 0 && key < array[end]){
                array[end+1] = array[end];
                end--;
            }
            array[end+1] = key;
        }
    }
}

public class Test2{
    public static void main(String[] args) {
        int[] array = new int[]{2,0,4,9,3,6,8,7,1,5};
        Sort sort = new Sort();
        Print(array);
        sort.InsertSort(array,array.length);
        System.out.println();
        Print(array);
    }
    public static void Print(int[] array){
        for(int tmp : array){
            System.out.print(tmp + " ");
        }
    }
}














