/*
-1 : o1 < o2
0 : o1 == o2
+1 : o1 > o2
*/
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                int s1Space = s1.indexOf(' ');
                int s2Space = s2.indexOf(' ');
                char s1FirstChar = s1.charAt(s1Space + 1);
                char s2FirstChar = s2.charAt(s2Space + 1);
                
                if (s1FirstChar <= '9'){ 
                    if (s2FirstChar <= '9'){
                        return 0;
                    }
                    else return 1; // s1IsNum < s2IsChar
                }
                if (s2FirstChar <= '9') return -1; // s1IsChar > s1IsNum
                
                int pre = s1.substring(s1Space+1).compareTo(s2.substring(s2Space+1));
                if (pre == 0){
                    return s1.substring(0, s1Space).compareTo(s2.substring(0,s2Space));
                }
                
                return pre;
            }
        };
        
        Arrays.sort(logs, myComp);

        return logs;
    }
}