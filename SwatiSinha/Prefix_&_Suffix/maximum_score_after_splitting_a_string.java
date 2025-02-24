public class maximum_score_after_splitting_a_string {
    class Solution {
        public int maxScore(String s) {
            int ones = 0;
            int zeroes = 0;
            int max = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ones++;
                }
            }
            for (int i=0; i<s.length()-1; i++) {
                if (s.charAt(i) == '0') {
                    zeroes++;
                } else {
                    ones--;
                }
                max = Math.max(max, zeroes + ones);
            }
            return max;
        }
    }
}
