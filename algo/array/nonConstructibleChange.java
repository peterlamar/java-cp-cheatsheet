import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {

		Arrays.sort(coins);
		
		int change = 0;
		for (int x : coins){
			if (x > change + 1)	{
				return change + 1;
			}
			change += x;
		}
		
		return change + 1;
  }
}