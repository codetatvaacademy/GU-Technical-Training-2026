class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int i = 0; i < weights.length ; i++){
            max += weights[i];
        }
        while(min <= max){
            int mid = (min + max)/2;
            if(isValid(weights, mid, days)){
               max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return min;
    }
    public boolean isValid(int[] weights, int mid, int days){
        int sum = 0;
        int count = 1;
        for(int i = 0 ; i < weights.length ; i++){
            if(weights[i] > mid){
            return false;
            }
            if(sum + weights[i] > mid){
                count++;
                sum = 0;
            }
            sum += weights[i];
        }
        return count <= days;
    }
}
