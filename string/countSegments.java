class Solution {
    public int countSegments(String s) {
        int cnt = 0;
        for (String c : s.split(" ")){
            if (c.length() > 0)
                cnt++;
        }
        return cnt;
    }
    
    public int countSegments2(String s) {
        int cnt = 0;
        Scanner sc = new Scanner(s);
        while (sc.hasNext()){
            sc.next();
            cnt++;
        }
        return cnt;
    }
}