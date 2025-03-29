class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        long sum = 0;

        for(int candie:candies){
             max = Math.max(max,candie);
             sum += candie;
        }
        if(k>sum) return 0;

        int start = 1;
        int end = max;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(canAllocate(candies,mid,k)){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }

private boolean canAllocate(int[] candies , int mid , long k){
if(mid == 0){
    return k == 0;
}
long totalChildrenSupported = 0;
for(int candie:candies){
    totalChildrenSupported += candie / mid;
}
   return totalChildrenSupported >= k;

   }
}