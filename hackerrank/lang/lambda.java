import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
    PerformOperation isOdd(){
        return x -> (x % 2)==1;
    }

    PerformOperation isPrime(){
        return p -> {
            if(p<3)
                return true;
            if((p % 2)==0)
                return false;
        for(int i=3;i<Math.sqrt(p);i+=2)
            if((p % i)==0)
                return false;
            return true;
        }; 
    }

    PerformOperation isPalindrome(){
        return p -> {String pS=((Integer)p).toString();
        int n=pS.length();
        for(int i=0;i<n/2;i++)
            if(pS.charAt(i) != pS.charAt(n-1-i))
                return false;
            return true;
        };
    }
}


public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
