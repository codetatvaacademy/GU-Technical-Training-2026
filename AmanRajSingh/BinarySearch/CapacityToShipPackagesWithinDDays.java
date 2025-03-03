class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap= 0;
        int maxcap = 0;

        for(int weight:weights){
            mincap = Math.max(mincap , weight);
            maxcap += weight;
        }
        int start = mincap;
        int end = maxcap;
        int result = 0;
        while(start<end){
            int mid = start +(end-start) / 2;
            if(canShip(weights,days,mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    private boolean canShip(int[]weights, int days, int capacity){
        int currweight = 0;
        int D = 1;
        
        for(int weight:weights){
            if(currweight + weight > capacity){
                D++;
                currweight = 0;
            }
            currweight += weight;
        }
        return D <= days;
    }

}