class Solution {
    public int maxSubArray(int[] nums) {
        int []dp = new int[nums.length];
        dp[0] = nums[0];
        int rtn = nums[0];

        for (int x=1; x < nums.length; x++){
            dp[x] = nums[x];
            if (dp[x-1] > 0){
                dp[x] += dp[x-1];
            }
            rtn = Math.max(rtn, dp[x]);
        }
                
        return rtn;
    }
}