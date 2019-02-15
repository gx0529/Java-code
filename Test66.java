package www.bit.java;


class Sort{
    public void MergeSort(int[] array, int size){
        int[] temp = new int[size];
        _MergeSort(array, 0, size, temp);
    }

    public void _MergeSort(int[] array, int left, int right, int[] temp){
        if(right-left>1){
            int mid = left+(right-left)/2;
            _MergeSort(array, left, mid, temp);
            _MergeSort(array, mid, right, temp);
            MergeData(array, left, mid, right, temp);
            System.arraycopy(temp,left,array,left,right-left);
        }
    }

    public void MergeData(int[] array, int left, int mid, int right, int[] temp){
        int begin1 = left;
        int end1 = mid;
        int begin2 = mid;
        int end2 = right;
        int index = left;
        while(begin1 < end1 && begin2 < end2){
            if(array[begin1] < array[begin2]){
                temp[index++] = array[begin1++];
            }
            else {
                temp[index++] = array[begin2++];
            }
        }
        while (begin1 < end1){
            temp[index++] = array[begin1++];
        }
        while(begin2 < end2){
            temp[index++] = array[begin2++];
        }
    }
}

public class Test2{
    public static void main(String[] args) {
        int[] array = new int[]{2,0,4,9,3,6,8,7,1,5};
        Sort sort = new Sort();
        Print(array);
        sort.MergeSort(array,array.length);
        System.out.println();
        Print(array);
    }
    public static void Print(int[] array){
        for(int tmp : array){
            System.out.print(tmp + " ");
        }
    }
}














