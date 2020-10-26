class Solution {
    public int trap(int[] height) {
        int l = 0;
        int lm = 0;
        int rm = 0;
        int r = height.length - 1;
        int cnt = 0;
        while (l < r){
            lm = Math.max(height[l], lm);
            rm = Math.max(height[r], rm);
            if (rm > lm){
                cnt += lm - height[l];
                l++;
            }
            else{
                cnt += rm - height[r];
                r--;                
            }
        }
        
        return cnt;
    }
}