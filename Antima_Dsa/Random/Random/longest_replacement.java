public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];  // Frequency array for characters 'A' to 'Z'
        int left = 0, maxCount = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Increment the count for the current character
            count[s.charAt(right) - 'A']++;
            // Find the count of the most frequent character in the window
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            
            // If the window size minus the most frequent character count is greater than k, shrink the window
            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "ABAAABBBBCC";
        int k = 2;
        System.out.println(characterReplacement(s, k));  // Output: 7
    }
}
