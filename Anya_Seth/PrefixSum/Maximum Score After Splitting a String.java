class Solution {
    public int maxScore(String s) {
        int ones  = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        int zeroes = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                zeroes++;
            }
            else{
                ones--;
            }
            ans = Math.max(ans, zeroes + ones);
        }
        return ans;
    }
}
