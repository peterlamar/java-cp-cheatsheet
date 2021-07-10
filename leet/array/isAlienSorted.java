class Solution {
    public boolean isAlienSorted(String[] words, String order) {
     
        Map<Character, Integer> mp = new HashMap<>();
        
        for (int x=0; x<order.length(); x++){
            mp.put(order.charAt(x),x);
        }
                
        for (int i=1; i < words.length; i++){
            String w0 = words[i-1];
            String w1 = words[i];
            
            for (int a=0; a< w0.length(); a++){
                if (a == w1.length()){
                    return false;
                }
                Character w0char = w0.charAt(a);
                Character w1char = w1.charAt(a);
                
                if (mp.get(w0char) < mp.get(w1char)){
                    break;
                }
                if (mp.get(w0char) > mp.get(w1char)) {
                    return false;
                }
            }
        }
        return true;
    }
}