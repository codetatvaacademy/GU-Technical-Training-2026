class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        while (end < s.length()) {
            int idx = s.charAt(end);
            arr[idx]++;
            while (arr[idx] > 1) {
                arr[s.charAt(start)]--;
                start++;
            }
            max = Math.max(max, end - start + 1);

            end++;

        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}