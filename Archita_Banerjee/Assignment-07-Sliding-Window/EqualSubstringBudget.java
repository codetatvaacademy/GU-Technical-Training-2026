public class EqualSubstringBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int start=0;
        int end=0;
        int cost=0;
        int maxLen=0;
        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();
        while(end < s1.length){
            cost += Math.abs(s1[end]-t1[end]);

            while(cost>maxCost){
                cost -= Math.abs(s1[start]-t1[start]);
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);
            end++;
        }
        return maxLen;

    }
}
