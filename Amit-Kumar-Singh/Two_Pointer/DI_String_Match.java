class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int increasing = 0;
        int decreasing = n;
        int[] ans = new int[n+1];
        char[] str = s.toCharArray();
        for(int i=0;i<n;i++){
            if(str[i]=='I'){
                ans[i] = increasing++;
            }
            else{
                ans[i] = decreasing--;
            }
        }
        if(str[n-1]=='I'){
            ans[n] = increasing;
        }
        else{
            ans[n] = decreasing;
        }
        return ans;
    }
}