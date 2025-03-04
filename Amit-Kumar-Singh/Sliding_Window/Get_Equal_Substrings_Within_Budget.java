class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n =s.length();
        int start = 0;
        int cost = 0;
        int maxL = 0;
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();
        for(int end = 0;end <n;end++){
            cost += Math.abs(s2[end]-t2[end]);
            while(cost>maxCost){
                cost -=Math.abs(s2[start]-t2[start]);
                ++start;
            }
            maxL = Math.max(maxL, end-start+1);
        }
        return maxL;
    }
}