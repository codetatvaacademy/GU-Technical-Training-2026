class Solution {
    public String minWindow(String s, String t) {
        int start = 0, end = 0, minLength = s.length() + 1;
        int startIndex = -1;
        int unique = 0;
        int[] freqT = new int[128];
        int[] freqS = new int[128];

        for (char c : t.toCharArray()) {
            freqT[c]++;
            if (freqT[c] == 1) {
                unique++;
            }
        }
        while (end < s.length()) {
            char c = s.charAt(end);
            freqS[c]++;
            if (freqS[c] == freqT[c]) {
                unique--;
            }
            while (unique == 0) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    startIndex = start;
                }
                char ch = s.charAt(start);
                if (freqS[ch] == freqT[ch]) {
                    unique++;
                }
                freqS[ch]--;
                start++;
            }
            end++;
        }
        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
    }
}