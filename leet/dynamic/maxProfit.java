class Solution {
    public int maxProfit(int[] prices) {
        int t0 = 0, t1 = Integer.MIN_VALUE;
        for (int p : prices){
            t0 = Math.max(t0, t1 + p);          
            t1 = Math.max(t1, -p);
        }
        return t0;
    }
}
