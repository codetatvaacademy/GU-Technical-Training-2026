class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){   // i=0 there is no previous element
            nums[i] += nums[i-1];
        }
        return nums;
    }
}