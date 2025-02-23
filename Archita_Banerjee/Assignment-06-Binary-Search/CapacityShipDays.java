public class CapacityShipDays {

    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        for(int i=0;i<weights.length;i++){
        max +=weights[i];
    }
    int min=max/days;
        while(min<=max){
        int  mid = (max+min)/2;
        if(isPossible(weights,mid, days)){
            max=mid-1;
        }else{
            min= mid+1;
        }
    }
        return min;
}
    public static boolean isPossible(int[]weights, int cap, int days){
        days--;
        int wt=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>cap){
                return false;
            }else if(wt+weights[i]>cap){
                days--;
                wt=0;
            }
            wt+=weights[i];
        }
        return days>=0;
    }
}
