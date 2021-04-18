import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int a = 0;
		int s = 0;
		
		while (a < array.size() && s < sequence.size()){
			if (array.get(a) == sequence.get(s)){
				a++;
				s++;
			} else{
				a++;
			}
		}
		
		if (s == sequence.size()){
			return true;
		}
		
		return false;
  }
}
