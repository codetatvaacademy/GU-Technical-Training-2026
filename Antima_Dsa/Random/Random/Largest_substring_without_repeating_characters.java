import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        // Edge case: empty string
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Map to store the last index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start of the current substring

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
            "abcabcbb", 
            "bbbbb",   
            "pwwkew",   
            "",         
            " ",        
            "abba"     
        };

        for (String s : testCases) {
            int result = longestSubstringWithoutRepeatingCharacters(s);
            System.out.println("Input: '" + s + "' -> Longest substring length: " + result);
        }
    }
}
