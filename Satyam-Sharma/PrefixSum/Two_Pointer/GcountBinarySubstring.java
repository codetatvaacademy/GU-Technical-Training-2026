import java.util.Scanner;

public class GcountBinarySubstring {
    public static int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                curr++;
            else {
                prev = curr;
                curr = 1;
            }
            if (prev >= curr)
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(countBinarySubstrings(s));
    }
}
