class Solution {
    public int pivotIndex(int[] nums) {
       int total = 0;
       int sum = 0;
       for(int i = 0 ; i < nums.length ; i++){
        total += nums[i];
       }
       for(int i = 0 ; i < nums.length ; i++){
         sum += nums[i];
         if(sum == total){
            return i;
        }
        total -= nums[i];
       }
       return -1;
    }
}
