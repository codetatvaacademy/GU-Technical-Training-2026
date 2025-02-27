import java.util.*;

public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxLength = 0;
        int[] map = new int[128];

        while (end < s.length()) {
            char c = s.charAt(end);
            start = Math.max(start, map[c]);
            maxLength = Math.max(maxLength, end - start + 1);
            map[c] = end + 1;
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        LongestUniqueSubstring sol = new LongestUniqueSubstring();
        System.out.println(sol.lengthOfLongestSubstring(s));

        sc.close();
    }
}
