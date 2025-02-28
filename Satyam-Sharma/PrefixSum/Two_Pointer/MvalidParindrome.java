import java.util.Scanner;

public class MvalidParindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            int ch1 = s.charAt(start);
            int ch2 = s.charAt(end);
            if (!(ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9'))
                start++;
            else if (!(ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9'))
                end--;
            else {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
