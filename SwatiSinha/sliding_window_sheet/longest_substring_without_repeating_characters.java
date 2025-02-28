class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int[] arr = new int[128];
        int maxLen = 0;
        while (end < s.length()) {
            int index = s.charAt(end);
            start = Math.max(arr[index], start);
            arr[index] = end + 1;
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}