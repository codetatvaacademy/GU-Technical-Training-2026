class Solution {
    public int minOperations(int[] nums, int x) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int totalSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            totalSum += nums[i];
        }
        int target = totalSum - x;
        if(totalSum == x ){
            return nums.length;
        }
        while(end < nums.length){ 
            target -= nums[end];
            while(target < 0 && start <= end){
                target += nums[start];
                start++;
            }
            if(target == 0){
            maxLength = Math.max(maxLength ,(end - start) + 1);
            }
            end++;
        }
        if(maxLength == 0){
            return -1;
        }
        else{
        return nums.length - maxLength;
        }
    }
}
