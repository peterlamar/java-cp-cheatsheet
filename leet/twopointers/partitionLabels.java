class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<Integer>();
        int[] map = new int[26];
        
        for (int i = 0; i < S.length(); i++){
            map[S.charAt(i) - 'a'] = i;    
        }
        
        int l = 0, r = 0;
        for (int i = 0; i < S.length(); i++){
            l = Math.max(l, map[S.charAt(i) - 'a']);
            if (l == i){
                list.add(l-r+1);
                r = i + 1;
            }
        }
        
        return list;
    }
}