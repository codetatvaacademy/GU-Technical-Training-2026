class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        for(int pile: candies){
            max = Math.max(pile,max);
        }
        int start = 0;
        int end = max;
        while(start<end){
            int mid = (start+end+1)/2;
            if(helper(candies,mid,k)){
                start = mid;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
    boolean helper(int[] candies, int mid,long k){
        long maxChildren = 0;
        for(int i=0;i<candies.length;i++){
            maxChildren += candies[i]/mid;
        }
        return maxChildren>=k;
    }
}