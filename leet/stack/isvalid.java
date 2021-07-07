class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');}
            else if (c == '['){
                stack.push(']');}
            else if (c == '{'){
                stack.push('}');
                }
            else if (stack.empty() || stack.pop() != c){
                return false;
            }
        }
        
        return stack.empty();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                stk.push(')');
            } else if (s.charAt(i) == '['){
                stk.push(']');
            } else if (s.charAt(i) == '{'){
                stk.push('}');
            } else if (stk.isEmpty() || stk.pop() != s.charAt(i)){
                return false;
            }       
        }
        
        return stk.isEmpty();
    }
}