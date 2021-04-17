import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
		Set<Integer> nums = new HashSet<Integer>();
		for (int x : array){
			int match = targetSum - x;
			if (nums.contains(match)){
				return new int[]{match, x};
			} else {
				nums.add(x);
			}
		}
		return new int[0];
  }
}


import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		int l = 0;
		int r = array.length - 1;
		while (l < r){
			int low = array[l];
			int high = array[r];
			int sum = low + high;
			if (sum == targetSum){
				return new int[]{low, high};
			} else if (sum < targetSum){
				l++;
			} else if (sum > targetSum){
				r--;
			}
		}
		return new int[0];
  }
}
