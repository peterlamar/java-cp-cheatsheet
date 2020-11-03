import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int []alp = new int[26];
        for (int i = 0; i < a.length(); i++)
            alp[Character.toLowerCase(a.charAt(i)) - 'a']++;
        for (int i = 0; i < b.length(); i++)
            alp[Character.toLowerCase(b.charAt(i)) - 'a']--;
        for (int i : alp){
            if (i != 0){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
