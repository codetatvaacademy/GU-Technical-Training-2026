class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0;
        int n = colors.length;
        int count = 0;
        
        for(int end = 1; end < n+k-1; end++){
            if(colors[end % n] != colors[(end+1) % n] ){
                if(end-start+1 >= k ){
                    count ++;
                }
            }
            else{
                start = end;
            }
        }
        return count;
    }
}
