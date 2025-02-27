import java.util.Scanner;

public class ValidPalindrome {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
           ValidPalindrome vp = new ValidPalindrome();
           System.out.println(vp.isPalindrome(s));
        }
}
