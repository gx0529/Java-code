package www.bit.java;


class Sort{
    public void HeapSort(int[] array, int size){
        //1.建堆
        for(int root=((size-2) / 2); root>=0; root--){
            HeapAdjust(array, size, root);
        }
        //2.排序
        int end = size-1;
        while(end > 0){
            Swap(array, 0, end);
            HeapAdjust(array, end, 0);
            end--;
        }
    }

    public void HeapAdjust(int[] array, int size, int parent){
        //先判断有没有叶子结点(只需要判断左孩子就可以了)
        int child = parent*2+1;
        while(child < size){
            if(child+1 < size && array[child+1]>array[child]){
                child = child+1;
            }
            if(array[parent] >= array[child]){
                break;
            }
            Swap(array, parent, child);
            parent = child;
            child = 2*parent + 1;
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
        sort.HeapSort(array,array.length);
        System.out.println();
        Print(array);
    }
    public static void Print(int[] array){
        for(int tmp : array){
            System.out.print(tmp + " ");
        }
    }
}













