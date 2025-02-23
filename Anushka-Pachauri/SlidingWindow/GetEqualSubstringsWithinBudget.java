class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        while (end < s1.length) {
            maxCost -= Math.abs(s1[end] - t1[end]);
            while (maxCost<0) {
                maxCost += Math.abs(s1[start] - t1[start]);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}