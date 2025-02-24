class Solution {
    public String minWindow(String s, String t) {
        int[] freqT = new int[128];
        int[] freqS = new int[128];

        int start = 0;
        int end = 0;
        int count = 0;
        int startIndx = -1;
        int endIndx = -1;
        int minLength = s.length() + 1;
    
        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            if(freqT[ch] == 0){
                count++;
            }
            freqT[ch]++;
        }
        while(end < s.length()){
            char c = s.charAt(end);
            freqS[c]++;
            if(freqS[c] == freqT[c]){
                count--;
            }
            while(count == 0){
                if(end - start + 1 < minLength){
                    startIndx = start;
                    endIndx = end;
                    minLength = end - start + 1;
                }
            char ch = s.charAt(start);
            if(freqS[ch] == freqT[ch]){
                count++;
            }
            start++;
            freqS[ch]--;
        }
        end++;
        }
          return startIndx == -1 ? "" : s.substring(startIndx, endIndx + 1);
    }
}
