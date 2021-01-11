import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();
        in.close();
        
        try {
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            m.update(msg.getBytes());
            byte[] hash = m.digest();
        
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
            } catch (Exception e) {}
    }
}