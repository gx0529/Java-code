package www.bit.java;


class Sort{
    public void SelectSort(int[] array, int size){
        int begin = 0;
        int end = size-1;
        while(begin < end){
            int maxPos = begin;
            int minPos = begin;
            for(int j=begin; j<=end; j++){
                if(array[j] > array[maxPos]){
                    maxPos = j;
                }
                if(array[j] < array[minPos]){
                    minPos = j;
                }
            }
            if(maxPos != end){
                Swap(array, maxPos,end);
            }
            if(minPos == end){
                minPos = maxPos;
            }
            if(minPos != begin){
                Swap(array, minPos, begin);
            }
            begin++;
            end--;
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














