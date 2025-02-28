class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, end = 0, cost = 0, len = 0;

        while (end < s.length()) {

            cost += Math.abs(s.charAt(end) - t.charAt(end));

            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            len = Math.max(len, end - start + 1);
            end++;
        }
        return len;
    }
}
