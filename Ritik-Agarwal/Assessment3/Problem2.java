// using sliding window
// Time Complexity -> O(n)
// Space Complexity -> O(1)

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(longestBeautiful(s));
    }

    private static int longestBeautiful(String s) {
        int count = 1, start = 0, end = 1, len = 0;
        while (end < s.length()) {                              // O(n)
            if (s.charAt(end) > s.charAt(end - 1)) {
                count++;
            }
            if (s.charAt(end) < s.charAt(end - 1)) {
                start = end;
                count = 1;
            }
            if (count == 5) {
                len = Math.max(len, end - start + 1);
            }
            end++;
        }
        return len;
    }
}