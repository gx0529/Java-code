public class QuickSort{
    public static void PrintArray(int [] array, int size){
        int i = 0;
        for(i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int Partion(int [] array, int left, int right){
        int pivot = array[right];
        int begin = left;
        int end = right;
        while(begin < end){
            while(begin<end && array[begin]<=pivot){
                begin++;
            }
            if(begin == end){
                break;
            }
            array[end] = array[begin];
            while(begin<end && array[end]>=pivot){
                end--;
            }
            if(begin == end){
                break;
            }
            array[begin] = array[end];
        }
        array[begin] = pivot;
        return begin;
    }
    public static void __QuickSort(int [] array, int left, int right){
        int pivot,div;
        if(left >= right){
            return;
        }
        div = Partion(array, left, right);
        __QuickSort(array, left, div-1);
        __QuickSort(array, div+1, right);
    }
    public static void QuickSort(int [] array, int size){
        __QuickSort(array, 0, size-1);
    }
    public static void test(){
        int [] array = {3,5,1,4,2,9,7,6,8,0};
        int size = array.length;
        QuickSort(array,size);
        PrintArray(array,size);
    }
    public static void main(String[] args){
        test();
    }
}