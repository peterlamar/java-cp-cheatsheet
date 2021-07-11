class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> rtn = new LinkedList<>();
        if (digits.isEmpty()) return rtn;
        Map<String, String> map = new HashMap<>();
        map.put("0","0");
        map.put("1","1");
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        rtn.add("");
        for (int i=0; i<digits.length(); i++){
            while (rtn.peek().length() == i){
                String t = rtn.remove();
                String tmpDigits = map.get(String.valueOf(digits.charAt(i)));
                for (char c : tmpDigits.toCharArray()){
                    rtn.add(t + c);
                }
            }
        }
                
        return rtn;
    }
}


class Solution {
    public static String[] dict = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.length()==0) return new ArrayList<>();
        List<String> rtn = new ArrayList<>();
        backtracking(rtn, digits.toCharArray(), "");
        return rtn;
    }
    
    public void backtracking(List<String> combos, char[] digits, String s){
        if (s.length() == digits.length) {
            combos.add(s);
            return;
        }
        int i = s.length();
        int digit = digits[i] - '0';
        for (char c : dict[digit].toCharArray()){
            backtracking(combos, digits, s + Character.toString(c));
        }
    }
}