import java.util.*;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        int start = 0, end = 0, sIndex = -1, eIndex = -1;
        int countT = 0, countS = 0, minLength = s.length() + 1;
        int[] frequencyT = new int[128];
        int[] frequencyS = new int[128];

        for (char c : t.toCharArray()) {
            if (frequencyT[c] == 0) countT++;
            frequencyT[c]++;
        }

        while (end < s.length()) {
            char c1 = s.charAt(end);
            frequencyS[c1]++;
            if (frequencyS[c1] == frequencyT[c1]) countS++;

            while (countS == countT) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    sIndex = start;
                    eIndex = end;
                }
                char c2 = s.charAt(start);
                frequencyS[c2]--;
                if (frequencyS[c2] < frequencyT[c2]) countS--;
                start++;
            }
            end++;
        }
        return sIndex == -1 ? "" : s.substring(sIndex, eIndex + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        MinWindowSubstring sol = new MinWindowSubstring();
        System.out.println(sol.minWindow(s, t));

        sc.close();
    }
}
