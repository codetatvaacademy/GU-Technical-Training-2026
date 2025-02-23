//Time Complexity: O(nlog(cars))
//Space Complexity: O(1)
class Solution {
    public long binarySearch(int[] ranks, int cars, long end){
        long start = 1;
        long ans = -1;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(isPossible(ranks, cars, mid)){
                end = mid-1;
                ans = mid;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] ranks, int cars, long time){
        long sum = 0;
        for(int i=0;i<ranks.length;i++){
            sum += (int)Math.sqrt((long)time/ranks[i]);
        }
        if(sum>=cars){
            return true;
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        int minRank = 101;
        for(int i=0;i<ranks.length;i++){
            minRank = Math.min(minRank,ranks[i]);
        }
        long minEnd = (long)minRank*cars*cars;
        //System.out.println(minEnd);
        return binarySearch(ranks, cars, minEnd);
    }
}