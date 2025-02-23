public class MaxScoreString {
    public int maxScore(String s) {
        int ones=0;
        int zeros=0;
        int maxScore=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeros+=1;
            }else{
                ones--;
            }
            maxScore= Math.max(maxScore, ones+zeros);
        }
        return maxScore;
    }
}
