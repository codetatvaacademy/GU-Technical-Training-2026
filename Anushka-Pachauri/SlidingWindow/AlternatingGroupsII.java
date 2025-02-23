class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count=0;
        int start=0;
        int end=1;
        while(end<(colors.length+k-1)){
            if(colors[end%n]==colors[(end-1)%n]){
                start=end;
            }
            else if((end-start+1)==k){
                count++;
                start++;
            }
            end++;
        }
        return count;
    }
}