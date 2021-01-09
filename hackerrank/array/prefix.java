import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        
        int cnt =0;
        
        for (int x=0; x<n; x++){
            int sum = 0;
            for (int i=x; i<n;i++){
                sum += a[i];
                if (sum < 0) cnt++;
            }
        }
        System.out.println(cnt);

    }
}