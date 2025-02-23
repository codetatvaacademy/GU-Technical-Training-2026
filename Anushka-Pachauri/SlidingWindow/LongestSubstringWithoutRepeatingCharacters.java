class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] startIndex=new int[128];
        int start=0;
        int end=0;
        int maxLen=0;
        char[] s1=s.toCharArray();
        if(s1.length==0){
            return 0;
        }
        while(end<s1.length){
            start=Math.max(start,startIndex[s1[end]]);
            maxLen=Math.max(maxLen,end-start+1);
            startIndex[s1[end]]=end+1; 
            end++;
        }
        return maxLen;
    }
}