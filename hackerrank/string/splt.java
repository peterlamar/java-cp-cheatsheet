import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String dl = "[!,?._'@\\s]+";
        s = s.trim();
        if (s.length() == 0){
            System.out.println(0);
            return;
        }
        String []tokens = s.split(dl);
        System.out.println(tokens.length);
        for (String t : tokens){
            System.out.println(t);
        }
        scan.close();
    }
}

