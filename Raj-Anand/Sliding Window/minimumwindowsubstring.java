class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int start=0;
        int end=0;
        int lenT=0;
        int lenS=0;
        int si=-1;
        int ei=-1;
        int minlength=Integer.MAX_VALUE;
        int[]freqS=new int[128];
        int []freqT=new int[128];
        for(char c: t.toCharArray()){
            
            ++freqT[c];
            if(freqT[c]==1){
                ++lenT;

            }
        }
        while(end<s.length()){
            char c=s.charAt(end);
            ++freqS[c];
            if(freqS[c]==freqT[c]){
                ++lenS;
            }
            while(lenS==lenT){
                if(end-start+1<minlength){
                     si=start;
                     ei=end;
                    minlength=end-start+1;
                }
                char ch=s.charAt(start);
                if(freqS[ch]==freqT[ch]){
                    --lenS;
                }
                --freqS[ch];
                ++start;

            }
            ++end;

        }
        return si==-1?"":s.substring(si,ei+1);
        
    }
}
