import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numRows = in.nextInt();
        
        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
        for (int i=0; i<numRows; i++){
            int numColumns = in.nextInt();
            ArrayList<Integer> col = new ArrayList<>();
            for (int x=0; x<numColumns; x++){
                col.add(in.nextInt());
            }
            row.add(col);
        }
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(row.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
    }
}