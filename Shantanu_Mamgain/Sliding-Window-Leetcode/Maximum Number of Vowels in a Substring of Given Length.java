class Solution {
    public int maxVowels(String s, int k) {
        int start = 0 ;
        int end = k-1;
        int maxLen = 0;
        int count = 0;
        for(int i = start; i<=end; i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count ++;
            }
        }
        maxLen = Math.max(maxLen, count);

        while(end < s.length()-1){
            end++;
            start++;
            if(s.charAt(start-1)=='a'||s.charAt(start-1)=='e'||s.charAt(start-1)=='i'||s.charAt(start-1)=='o'||s.charAt(start-1)=='u'){
                count --;
            }
            if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u'){
                count ++;
            }
            
            maxLen = Math.max(maxLen, count);
            
        }

        return maxLen;
    }

}
