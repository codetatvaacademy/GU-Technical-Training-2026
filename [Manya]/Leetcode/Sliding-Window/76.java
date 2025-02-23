import java.util.Scanner;

class Solution {
    public String minWindow(String s, String t) {
        int[] s1 = new int[128];
        int[] t1 = new int[128];

        int start = 0, end = 0, si = -1;
        int count = 0, minLength = Integer.MAX_VALUE;

        for (char c : t.toCharArray()) {
            if (t1[c] == 0) {
                ++count;
            }
            t1[c]++;
        }

        while (end < s.length()) {
            char c = s.charAt(end);
            ++s1[c];

            if (s1[c] == t1[c]) {
                --count;
            }

            while (count == 0) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    si = start;
                }
                char ch = s.charAt(start);
                s1[ch]--;
                if (s1[ch] < t1[ch]) {
                    ++count;
                }
                start++;
            }
            end++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(si, si + minLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter string t: ");
        String t = scanner.nextLine();

        Solution solution = new Solution();
        String result = solution.minWindow(s, t);

        System.out.println("Minimum window substring: " + result);

        scanner.close();
    }
}
