class Solution {
    public String minWindow(String s, String t) {
        int start = 0;
        int end = 0;
        int subStart = -1;
        int subEnd = -1;
        int minL = Integer.MAX_VALUE;
        int lengthT = 0;
        int lengthS = 0;
        int [] frequencyS = new int[128];
        int [] frequencyT = new int[128];
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            ++frequencyT[c];
            if(frequencyT[c]==1){
                lengthT++;
            }
        }
        while(end < s.length()){
            char c = s.charAt(end);
            frequencyS[c]++;
            if(frequencyS[c]==frequencyT[c]){
                lengthS++;
            }
            while(lengthS==lengthT){
                if(minL > Math.min(minL,end-start+1)){
                    subStart = start;
                    subEnd = end;
                    minL = end-start+1;
                }
                c =s.charAt(start);
                if(frequencyS[c]==frequencyT[c]){
                    lengthS--;
                }
                frequencyS[c]--;
                start++;
                }
            end++;
        }
        return subStart==-1? "":s.substring(subStart,subEnd+1);
    }
}