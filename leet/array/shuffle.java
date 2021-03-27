class Solution {
    public int[] shuffle(int[] nums, int n){
        int[] rtn = new int[nums.length];
        
        for (int i=0; i<n; i++){
            rtn[i*2] = nums[i];
            rtn[i*2+1] = nums[i+n];
        }
        return rtn;
    }
}