import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {        
        return isSolvable(leap, game, 0);
    }
    
    public static boolean isSolvable(int leap, int[] game, int spot){

        if (spot >= game.length){
            return true;
        }
        else if (spot < 0 || game[spot] == 1){

            return false;
        }
        game[spot] = 1;
        
        return isSolvable(leap, game, spot + leap) ||  
        isSolvable(leap, game, spot + 1)||  
        isSolvable(leap, game, spot - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}