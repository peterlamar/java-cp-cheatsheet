/*
1011
1010
1010
1000
1000
0
*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        
        while (n != 0){
            System.out.println(Integer.toBinaryString(n));
            n = n & n - 1;
            System.out.println(Integer.toBinaryString(n));
            count++;
        }
        
        return count;
    }
}