class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int[] arr =new int[128];

        while(end<s.length())
        {
            int pos= s.charAt(end);
            start = Math.max(arr[pos],start);
            arr[pos] = end + 1;
            maxLength= Math.max(maxLength,end - start+1);
            end++;
        }
    return maxLength;
    }
}