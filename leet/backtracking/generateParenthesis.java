class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> rtn = new ArrayList<>();
        helper(rtn, n, 0, "");
        return rtn;
    }
    
    public void helper(List<String> res, int left, int right, String s){
        if (left == 0 && right == 0){
            res.add(s);
            return;
        }
        if (left > 0){
            helper(res, left-1, right+1, s +"(");
        }
        if (right > 0){
            helper(res, left, right-1, s +")");
        }
    }
}