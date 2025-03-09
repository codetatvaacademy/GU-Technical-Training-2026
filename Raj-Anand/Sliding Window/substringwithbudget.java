class Solution {
    public int equalSubstring(String s, String t, int maxcost) {
        int start=0;
        int end=0;
        int cost=0;
        int maxlength=0;
        char []s1=s.toCharArray();
        char[] t1=t.toCharArray();
        while(end<s1.length){
            cost+=Math.abs(s1[end]-t1[end]);
        
        while(cost>maxcost){
            cost-=Math.abs(s1[start]-t1[start]);
            start++;
        }
        maxlength=Math.max(maxlength,end-start+1);
        end++;
        }
        return maxlength;

        
        
    }
}
