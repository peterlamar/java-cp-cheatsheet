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