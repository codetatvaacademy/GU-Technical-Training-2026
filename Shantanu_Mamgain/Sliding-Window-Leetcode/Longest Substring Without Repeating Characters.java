class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[] = new int[128];
        int start = 0;
        int end = 0;
        int maxLen = 0;
        while(end < s.length()) {      
            
            if(arr[s.charAt(end)] != start){
                start = Math.max(arr[s.charAt(end)], start);
            }
            arr[s.charAt(end)] = end +1;
            maxLen = Math.max(maxLen, end - start + 1);
            
            end ++;
             
            
        }

        return maxLen;
    }
}
