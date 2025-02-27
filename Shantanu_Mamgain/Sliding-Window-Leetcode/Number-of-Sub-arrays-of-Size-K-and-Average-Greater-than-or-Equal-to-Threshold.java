class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = k-1;
        int count = 0;
        int average = 0;
        int sum = 0;

        for(int i = 0; i <= end; i++){
            sum += arr[i];
        }
        average = sum/k;
        if(average >= threshold){
            count++;
        }

        while(end < arr.length-1){
            sum -= arr[start];
            start ++;
            end ++;
            sum += arr[end];

            average = sum/k;
            if(average >= threshold){
                count ++;
            }
        }

        return count;
    }
}
