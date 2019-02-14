package www.bit.java;


class Sort{
    public void ShellSort(int[] array, int size){
        int gap = size;
        while(gap > 1){
            gap = gap/3 + 1;
            for(int i=gap; i<size; i++){
                int key = array[i];
                int end = i-gap;
                while(end >= 0 && key < array[end]){
                    array[end+gap] = array[end];
                    end = end-gap;
                }
                array[end+gap] = key;
            }
        }
    }
}

public class Test2{
    public static void main(String[] args) {
        int[] array = new int[]{2,0,4,9,3,6,8,7,1,5};
        Sort sort = new Sort();
        Print(array);
        sort.ShellSort(array,array.length);
        System.out.println();
        Print(array);
    }
    public static void Print(int[] array){
        for(int tmp : array){
            System.out.print(tmp + " ");
        }
    }
}














