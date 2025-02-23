class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int targetSum=target;
        int minLength=Integer.MAX_VALUE;
        while(end<nums.length){
            target-=nums[end];
            while(target<=0){
                target+=nums[start];
                minLength=Math.min(minLength,end-start+1);
                start++;
            }
            end++;
        }
        return minLength==Integer.MAX_VALUE? 0 : minLength;
    }
}