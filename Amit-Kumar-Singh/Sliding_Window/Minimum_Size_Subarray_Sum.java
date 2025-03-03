class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int minL = Integer.MAX_VALUE;
        int sum = 0;
        for(int end = 0; end<nums.length;end++){
            sum += nums[end];
            while(sum>=target){
                minL = Math.min(minL,end-start+1);
                sum -= nums[start];
                start++;
            }
        }
        return minL==Integer.MAX_VALUE ? 0 : minL;
    }
}