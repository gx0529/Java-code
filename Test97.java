
����һ���������飬�ж��������Ƿ���������ͬ������ i �� j��
ʹ�� nums [i] �� nums [j] �Ĳ�ľ���ֵ���Ϊ t������ i �� j ֮��Ĳ�ľ���ֵ���Ϊ ?��

ʾ�� 1:
����: nums = [1,2,3,1], k = 3, t = 0
���: true

ʾ�� 2:
����: nums = [1,0,1,1], k = 1, t = 2
���: true

ʾ�� 3:
����: nums = [1,5,9,1,5,9], k = 2, t = 3
���: false


class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length && j-i<=k; j++){
                long l1 = nums[i];
                long l2 = nums[j];
                if((Math.abs(l1-l2)<=t)){
                    return true;
                }
            }
        }
        return false;
    }
}