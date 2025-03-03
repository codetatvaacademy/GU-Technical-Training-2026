class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)){
            return 0;
        }
        int curr = 0;
        int tLen = t.length();
        int sLen = s.length();
        for(int i =0;i<sLen;i++){
            if(curr<tLen && s.charAt(i)==t.charAt(curr)){
                curr++;
            }
        }
        return tLen-curr;
    }
}