class CapacityToShipPackagesWithinDDays {
    public boolean isValid(int[] weights, int capacity, int days){
        --days;
        int weightSum=0;
        for(int weight : weights){
            if(weight > capacity){
                return false;
            }
            else if(weightSum + weight > capacity){
                --days;
                weightSum=0;
            }
            weightSum+=weight;
        }
        return days>=0;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        for(int w : weights){
            max+=w;
        }
        int min=max/days;
        while(min<=max){
            int mid=(max+min)/2;
            if(isValid(weights,mid,days)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
    return min;
    }
}