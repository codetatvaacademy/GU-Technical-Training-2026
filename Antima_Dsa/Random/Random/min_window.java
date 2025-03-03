import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in t
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int left = 0; // Left pointer of the sliding window
        int minLeft = 0; // Starting index of the minimum window
        int minLen = Integer.MAX_VALUE; // Length of the minimum window
        int count = t.length(); // Number of characters to match

        // Expand the window using the right pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // If the current character is in t, decrement its count in the map
            if (targetMap.containsKey(rightChar)) {
                targetMap.put(rightChar, targetMap.get(rightChar) - 1);
                if (targetMap.get(rightChar) >= 0) {
                    count--; // Decrement the count of characters to match
                }
            }

            // When all characters are matched, contract the window
            while (count == 0) {
                // Update the minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                // Move the left pointer to the right
                char leftChar = s.charAt(left);
                if (targetMap.containsKey(leftChar)) {
                    targetMap.put(leftChar, targetMap.get(leftChar) + 1);
                    if (targetMap.get(leftChar) > 0) {
                        count++; // Increment the count of characters to match
                    }
                }
                left++;
            }
        }

        // If no valid window is found, return an empty string
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: \"" + minWindow(s1, t1) + "\""); // Expected: "BANC"

        String s2 = "a";
        String t2 = "a";
        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: \"" + minWindow(s2, t2) + "\""); // Expected: "a"

        String s3 = "a";
        String t3 = "aa";
        System.out.println("Input: s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: \"" + minWindow(s3, t3) + "\""); // Expected: ""

        String s4 = "ab";
        String t4 = "b";
        System.out.println("Input: s = \"" + s4 + "\", t = \"" + t4 + "\"");
        System.out.println("Output: \"" + minWindow(s4, t4) + "\""); // Expected: "b"
    }
}