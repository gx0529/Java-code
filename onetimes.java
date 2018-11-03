class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
public class Test{
    public static void main(String[] args){
        int[] data = new int[]{4,1,2,2,1};
        int result = new Solution().singleNumber(data);
        System.out.println(result);
    }
}