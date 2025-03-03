class Solution {
    public int countBinarySubstrings(String s) {
        int curr = 1;
        int prev = 0;
        int ans = 0;
        char[] str = s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(str[i]!=str[i-1]){
                ans += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            }
            else{
                curr++;
            }
        }
        return ans+Math.min(prev,curr);
    }
}