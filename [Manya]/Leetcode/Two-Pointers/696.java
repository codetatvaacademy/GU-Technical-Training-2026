class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int result = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            }
            else{
                result += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        result += Math.min(prev, curr);
        return result;
    }
}