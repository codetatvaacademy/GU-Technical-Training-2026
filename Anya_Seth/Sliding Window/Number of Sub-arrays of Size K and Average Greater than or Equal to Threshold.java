class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum  = 0;
        int count = 0;
        for(int i = 0; i < k ; i++){
            sum += arr[i];
        }
        if(sum/k >= threshold){
           count = 1;
        }
        else{
            count = 0;
        }
        for(int i = k ; i < arr.length ; i++){
            sum += arr[i] - arr[i - k];
            if(sum/k >= threshold){
                count++;
            }
        }
        return count;
    }
}
