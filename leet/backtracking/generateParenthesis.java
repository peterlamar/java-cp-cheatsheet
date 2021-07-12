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


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> rtn = new ArrayList<>();
        
        backtracking(rtn, n, n, 0, "");
        return rtn;
    }
    
    public void backtracking(List<String> rtn, int n, int left, int right, String s){
        if (s.length() == n*2){
            rtn.add(s);
            return;
        }
        if (left > 0){
             backtracking(rtn, n, left-1, right+1, s+'(');
        }
        if (right > 0){
             backtracking(rtn, n, left, right-1, s+')');
        }    
    }
}