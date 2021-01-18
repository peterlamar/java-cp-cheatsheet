import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(balanced(input));
		}
	}
    
    public static boolean balanced(String s){
        Stack<Character> stk = new Stack<Character>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{'){
                stk.push(c);
            }
            else if(c == ']'){
                if (stk.isEmpty() || stk.pop() != '['){
                    return false;
                }
            }
            else if(c == ')'){
                if (stk.isEmpty() || stk.pop() != '('){
                    return false;
                }
            }
            else if(c == '}'){
                if (stk.isEmpty() || stk.pop() != '{'){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}