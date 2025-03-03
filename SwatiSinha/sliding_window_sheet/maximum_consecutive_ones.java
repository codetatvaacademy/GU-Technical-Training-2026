class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxLength=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count=0;
            } else{
                count++;
            }
            maxLength=Math.max(count, maxLength);
        }
        return maxLength;
    }
}