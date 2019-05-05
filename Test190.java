/**
 * 给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，
 * 左部分A[0..K]，右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。
 * 求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，最大是多少？
 * 给定整数数组A和数组的大小n，请返回题目所求的答案。
 *
 * 基于贪心算法的思想
 * // 这两个数中有一个肯定是数组的最大值。要使得差值最大，那么另一边的最大值应尽可能的小。
 * // 假设最大值在左边，那么对于最大值右边的数组有很多种分法，每一种分法肯定都包含数组最后一个数字即A[n-1]。
 * // 如果不取A[n-1]，取最后一个数字和最大值中间的任一数字A[i]。
 * // 若A[i]大于A[n-1]，那还不如取最后一个数字；若最A[i] 小于A[n-1]，
 * // 那右半边的最大值肯定不是A[i]，所以无论如何右半边取最右端数字。
 * // 假设最大值在右边，同理左半边取最左端数字。
 * // 只需用数组最大值减去数组两端较小的那个值即可。
 */
public class Main {
    public static int absolute(int[] num, int length){
        int max = num[0];
        for(int i=0; i<length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return Math.abs(max-num[0]) > Math.abs(max-num[length-1]) ? Math.abs(max-num[0]):Math.abs(max-num[length-1]);
    }
    public static void main(String[] args) {
        int[] num = {2,7,3,1,1};
        System.out.println(absolute(num, num.length));
    }
}