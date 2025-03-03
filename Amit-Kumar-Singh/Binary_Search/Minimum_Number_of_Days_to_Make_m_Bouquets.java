class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int result = -1;
        int maxD=Integer.MIN_VALUE;
        int minD=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            maxD = Math.max(maxD,bloomDay[i]);
            minD = Math.min(minD,bloomDay[i]);
        }
        while(minD<=maxD){
            int mid = (maxD+minD)/2;
            int bouquetC = 0;
            int flower = 0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    flower++;
                    if(flower == k){
                        bouquetC++;
                        flower = 0;
                    }
                }
                else{
                    flower = 0;
                }
            }
            if(bouquetC>=m){
                result = mid;
                maxD = mid-1;
            }
            else{
                minD = mid+1;
            }
        }
        return result;
    }
}
