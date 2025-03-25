class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[128]; 
        for (char c : t.toCharArray()) {
            freq[c - 'A']++;
        }

        int start = 0, end = 0, minLength = Integer.MAX_VALUE;
        int count = t.length(); 
        String result = "";

        while (end < s.length()) {
            char endChar = s.charAt(end);
            
            if (freq[endChar - 'A'] > 0) {
                count--;
            }
            freq[endChar - 'A']--;
            end++;

            while (count == 0) {
                if (end - start < minLength) {
                    minLength = end - start;
                    result = s.substring(start, end);
                }

                char startChar = s.charAt(start);
                freq[startChar - 'A']++;

                if (freq[startChar - 'A'] > 0) {
                    count++;
                }
                start++;
            }
        }

        return result;
    }
}
