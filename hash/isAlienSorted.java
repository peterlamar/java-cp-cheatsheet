class Solution {
    int[] map = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++){
            map[order.charAt(i) - 'a'] = i;
        }
        
        for (int j = 1; j < words.length; j ++){
            if (bigger(words[j-1], words[j]))
                return false;
        }
        return true;
    }
    
    boolean bigger(String s1, String s2){
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n && i < m; ++i)
            if (s1.charAt(i)  != s2.charAt(i) )
                return map[s1.charAt(i) - 'a'] > map[s2.charAt(i) - 'a'];
        return n > m;
    }
    
}