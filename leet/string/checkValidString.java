class Solution {
    public boolean checkValidString(String s) {
        int cmax = 0;
        int cmin = 0;
        
        for (Character c : s.toCharArray()){
            if (c == '('){
                cmax++;
                cmin++;
            } else if (c == ')'){
                cmax--;
                cmin--;
            } else if (c == '*'){
                cmax++;
                cmin--;
            }
            
            if (cmax < 0){
                return false;
            }
            
            cmin = Math.max(cmin, 0);
            
        }
        return cmin == 0;
    }
}