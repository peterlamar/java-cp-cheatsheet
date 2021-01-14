import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> a = new LinkedList<>();
        for (int i=0; i<N;i++){
            a.add(scan.nextInt());
        }
        
        int Q = scan.nextInt();

        for (int i=0; i<Q;i++){
            String act = scan.next();
            if (act.equals("Insert")){
                int idx = scan.nextInt();
                int val = scan.nextInt();
                a.add(idx, val);
            }
            else if (act.equals("Delete")){
                int idx = scan.nextInt();
                a.remove(idx);
            }
        }
        scan.close();

        for (Integer num : a){
            System.out.print(num + " ");
        }

    }
}