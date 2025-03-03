class Solution {
    public int smallestDivisor(int[] nums, int threshold){
        int min = 1;
        int max = 1000000;
        while(min <= max){
            int mid = (min + max)/2;
            if(isValid(nums, mid, threshold)){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return min;
    }
    public boolean isValid(int[] nums, int mid, int threshold){
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += Math.ceilDiv(nums[i], mid);
        }
        return sum <= threshold;
    }
}
