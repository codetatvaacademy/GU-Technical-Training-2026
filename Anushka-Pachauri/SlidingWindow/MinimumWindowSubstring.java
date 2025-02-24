class Solution {
    public String minWindow(String s, String t) {
        int[] freqS=new int[128];
        int[] freqT=new int[128];
        int start=0;
        int end=0;
        int unique=0;
        int startIndex=-1;
        int minLength=Integer.MAX_VALUE;
        if(t.length()>s.length()){
            return "";
        }
        for(char ch : t.toCharArray()){
            if(freqT[ch]==0){
                unique++;
            }
            freqT[ch]++;
        }
        while(end<s.length()){
            char ch1=s.charAt(end);
            freqS[ch1]++;
            if(freqS[ch1]==freqT[ch1]){
                unique--;
            }
            while(unique==0){
                char ch2=s.charAt(start);
                if((end-start+1)<minLength){
                    minLength=end-start+1;
                    startIndex=start;
                }
                if(freqS[ch2]==freqT[ch2]){
                    unique++;
                }
                freqS[ch2]--;
                start++;
            }
            end++;
        }
        return minLength==Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLength);
    }
}