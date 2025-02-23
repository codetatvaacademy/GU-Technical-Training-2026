class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int one = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }

        int zero = 0;
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '1') {
                one--;
            } else {
                zero++;
            }

            max = Math.max(max, zero + one);
        }

        return max;
    }
}
