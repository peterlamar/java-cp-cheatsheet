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


class Solution {
    public int maxSubArray(int[] nums) {
        int a1 = nums[0];
        int a2 = nums[0];
        for (int x = 1; x < nums.length; x++){
            a1 = Math.max(a1+nums[x], nums[x]);
            a2 = Math.max(a2, a1);            
        }
        
        return a2;
    }
}