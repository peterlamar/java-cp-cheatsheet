class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rtn = new ArrayList<List<Integer>>();
        backtracking(rtn, candidates, target, new ArrayList<Integer>(), 0);
        return rtn;
    }
    
    public void backtracking(List<List<Integer>> rtn, int[] candidates, int remain, List<Integer> tmp, int start){

        if (remain == 0){
            rtn.add(new ArrayList<>(tmp));
            return;
        }
        else if (remain < 0){
            return;
        }
        for (int i=start; i < candidates.length; i++){
            tmp.add(candidates[i]);
            backtracking(rtn, candidates, remain - candidates[i], tmp, i);
            tmp.remove(tmp.size()-1);
        }
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rtn = new ArrayList<List<Integer>>();
        backtracking(rtn, candidates, target, new ArrayList<Integer>(), 0);
        return rtn;
    }
    
    public void backtracking(List<List<Integer>> rtn, int[] candidates, int target, List<Integer> tmp, int start){
        int sum=0;
        for (Integer element: tmp){
            sum = sum + element;
        }
        if (sum == target){
            rtn.add(new ArrayList<>(tmp));
            return;
        }
        else if (sum > target){
            return;
        }
        for (int i=start; i < candidates.length; i++){
            tmp.add(candidates[i]);
            backtracking(rtn, candidates, target, tmp, i);
            tmp.remove(tmp.size()-1);
        }
    }
}