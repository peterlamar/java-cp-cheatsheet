class Solution {
    public int[] runningSum(int[] nums){
        for (int x=1; x<nums.length; x++){
            nums[x] += nums[x-1];
        }
        return nums;
    }
}