class Solution {
    public int maxScore(String s) {
        int countOne=0;
        int countZero=0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                countOne ++;
            }
        }
        
        for(int j=0;j<s.length()-1;j++){
            if(s.charAt(j)=='0'){
                countZero++;
            }
            if(s.charAt(j)=='1'){
                countOne--;
            }

            max = Math.max(max, countOne+countZero);
            

        }
        return max;
    }
}
