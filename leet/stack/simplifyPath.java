class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<String>();
        for (String cur : path.split("/")){
            if (cur.equals("..")){
                if (!stk.empty()){
                    stk.pop();
                }
            }
            else if (cur.length() > 0 && !cur.equals(".")){
                stk.add(cur);
            }
        }
        return "/" + String.join("/", stk);
    }
}