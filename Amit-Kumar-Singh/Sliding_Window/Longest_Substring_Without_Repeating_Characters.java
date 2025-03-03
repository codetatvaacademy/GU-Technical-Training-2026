class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] count = new int[95];
        int start = 0;
        int longS = 0;
        for(int end = 0;end<n;end++){
            count[s.charAt(end)-32]++;
            while(count[s.charAt(end)-32]>1){
                count[s.charAt(start)-32]--;
                start++;
            }
            longS = Math.max(longS, end-start+1);
        }
        return longS;
    }
}