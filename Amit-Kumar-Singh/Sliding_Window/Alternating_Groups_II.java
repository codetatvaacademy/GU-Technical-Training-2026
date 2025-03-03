class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int alternator = colors[0];
        int count = 0;
        int start = 0;
        for(int end=1;end<n+k-1;end++){
            int idx = end%n;
            if(colors[idx] != alternator){
                alternator = colors[idx];
                if(end-start+1==k){
                    count++;
                    start++;
                }
            }
            else{
                start = idx;
                alternator = colors[start];
            }
        }
        return count;
    }
}