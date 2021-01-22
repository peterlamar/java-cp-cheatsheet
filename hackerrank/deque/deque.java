import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        HashSet hs = new HashSet<>(); 

        int n = in.nextInt();
        int m = in.nextInt();
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
           
            dq.add(num);
            hs.add(num);
            
            if (dq.size() == m){
                mx = Math.max(mx, hs.size());
                
                int first = dq.remove();
                if (!dq.contains(first)){
                    hs.remove(first);
                }
            }
        }
        
        System.out.println(mx);
    }
}



