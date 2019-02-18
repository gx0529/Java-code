
给定两个数组，编写一个函数来计算它们的交集。
示例 1:
输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2]

示例 2:
输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [9,4]


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        Arrays.sort(nums1);
        for(int i=0; i<nums1.length-1; i++){
            if(nums1[i] == nums1[i+1]){
                continue;
            }
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums2[j]);
                }
            }
        }
        for(int j=0; j<nums2.length; j++){
            if(nums1[nums1.length-1] == nums2[j]){
                set.add(nums2[j]);
            }
        }
        int[] tmp = new int[set.size()];
        int i=0;
        for(int temp : set){
            tmp[i++] = temp;
        }
        return tmp;
    }
}