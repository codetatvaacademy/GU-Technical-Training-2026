class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        for(int num : nums){
            end = Math.max(num,end);
        }

        while(start < end){
            int mid = start +(end-start)/2;
            int sum = 0;

            for(int num : nums){
                sum += Math.ceil((double) num / mid);
            }

            if(sum > threshold){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }

        return start;
    }
}