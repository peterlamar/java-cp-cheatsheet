class Solution {
    public int xorOperation(int n, int start){
        int rtn = start;
        
        for (int i=1; i<n;i++){
            rtn ^= start + i*2;        
        }
        
        return rtn;
    }
}