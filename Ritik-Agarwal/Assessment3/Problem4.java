// Time Complexity - O(n) -> sliding window approach
// Space Complexity - O(10) or O(1) -> frequency array of size 10 is used which will be constant

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(findSemiRepetitive(s));
    }

    private static int findSemiRepetitive(String s) {
        int[] freq = new int[10];
        int start = 0, end = 0, ans = 0, count = 0;

        while (end < s.length()) {
            int digit = s.charAt(end) - '0';
            freq[digit]++;

            if (freq[digit] <= 2) {
                if (freq[digit] == 2) {
                    count++;
                }
                if (count == 1) {
                    ans = Math.max(ans, end - start + 1);
                }
            }

            while (freq[digit] > 2 || count > 1) {
                int dig = s.charAt(start) - '0';
                if (freq[dig] == 2) {
                    count--;
                }
                freq[dig]--;
                start++;
            }

            end++;
        }
        return ans;
    }
}