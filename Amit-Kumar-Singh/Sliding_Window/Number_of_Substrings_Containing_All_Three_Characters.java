class Solution {
    public int numberOfSubstrings(String s) {
        int subCounter = 0;
        int[] abcCounter = new int[3];
        int n = s.length();
        int wStart = 0;
        for(int wEnd = 0;wEnd<n;wEnd++){
            abcCounter[s.charAt(wEnd)-'a']++;
            while(abcCounter[0]>0 && abcCounter[1]>0 && abcCounter[2]>0){
                subCounter += n-wEnd;
                abcCounter[s.charAt(wStart)-'a']--;
                wStart++;
            }
        }
        return subCounter;
    }
}