import java.util.Scanner;

public class SplittingString{
    public int maxScore(String s) {
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        
        int ans = 0;
        int zeros = 0;
        for (int i = 0; i < s.length() - 1; i++) { // Split before the last character
            if (s.charAt(i) == '1') {
                ones--;
            } else {
                zeros++;
            }
            ans = Math.max(ans, zeros + ones);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       SplittingString ss = new SplittingString();
        System.out.println(ss.maxScore(s));
    }
}
