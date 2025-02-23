//Time Compelxity: O(nlog(weightSum))
//Space Complexity: O(1)
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int weightSum = 0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>maxWeight){
                maxWeight = weights[i];
            }
            weightSum +=weights[i];
        }
        int result = weightSum;
        while(maxWeight<=weightSum){
            int mid = (maxWeight+weightSum)/2;
            if(shipCapacity(weights,days,mid)){
                result = mid;
                weightSum = mid-1;
            }
            else{
                maxWeight = mid+1;
            }
        }
        return result;
    }

    public boolean shipCapacity(int[] weights,int days,int cap){
        int addedWeight=0;
        int daysPassed = 1;
        for(int i=0;i<weights.length;i++){
            addedWeight+=weights[i];
            if(addedWeight>cap){
                addedWeight = weights[i];
                daysPassed++;
                if(daysPassed>days){
                    return false;
                }
            }
        }
        return true;
    }
}