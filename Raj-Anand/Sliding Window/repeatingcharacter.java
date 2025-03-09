class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlength=0;
        int arr[]=new int[128];
        while(end<s.length()){
            char c=s.charAt(end);
            start=Math.max(arr[c],start);
            maxlength=Math.max(maxlength,end-start+1);
            arr[c]=end+1;
            end++;

            
        }
        return maxlength;
        
    }
}
