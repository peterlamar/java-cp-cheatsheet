import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
		
		int[] sorted = new int[array.length];
		int y =0;
		for (int x : array){
			sorted[y] = x * x;
			y++;
		}	
	
		Arrays.sort(sorted);
		
    return sorted;
  }
}


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        for (int i = nums.length -1; i >= 0; i--){
            int ln = nums[l]*nums[l];
            int rn = nums[r]*nums[r];

            if (ln > rn){
                res[i] = ln;
                l++;
            } else {
                res[i] = rn;
                r--;
            }
        }
        return res;
    }
}