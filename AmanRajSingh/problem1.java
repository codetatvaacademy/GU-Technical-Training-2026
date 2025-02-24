class Solution {
    public long repairCars(int[] ranks, int cars) {

        long maxRank = 0;
        for(int r:ranks){
            if(r>maxRank){
                maxRank = r;
            }
        }

        long start = 0, end = (long) maxRank *cars *cars;
        long ans = 0;
        while(start<=end){
            long mid = start +(end-start) / 2;
            if(canRepair(ranks,mid,cars)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    private boolean canRepair(int[] ranks, long mid,int cars){
        long totalrepair = 0;
        for(int r : ranks){
            totalrepair += (long) Math.sqrt(mid / r);
        }
    
    return totalrepair >= cars;
    }
}
