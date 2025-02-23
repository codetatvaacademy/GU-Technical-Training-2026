public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        if(s==null|| t==null|| s.length()==0|| t.length()==0){
            return "";
        }
        int start=0;
        int end=0;
        int sIndex=-1;
        int unique=0;
        int minlen= s.length()+1;
        char[] frequencyS= new char[128];
        char[] frequencyT= new char[128];
        for (char c : t.toCharArray()) {
            frequencyT[c]++;
        }
        for (int count : frequencyT) {
            if (count > 0) {
                unique++;
            }
        }
        while(end < s.length()){
            char c = s.charAt(end);
            frequencyS[c]++;
            if(frequencyT[c]>0 && frequencyS[c]==frequencyT[c]){
                unique--;
            }
            while(unique==0){
                if(end-start+1<minlen){
                    minlen=end-start+1;
                    sIndex=start;
                }

                char ch= s.charAt(start);
                frequencyS[ch]--;

                if (frequencyT[ch] > 0 && frequencyS[ch] < frequencyT[ch]) {
                    unique++;
                }
                start++;
            }
            end++;
        }
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minlen);
    }
}
