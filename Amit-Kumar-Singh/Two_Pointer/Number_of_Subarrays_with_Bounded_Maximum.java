class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int invalidIdx = -1;
        int validCount = 0;
        int ans = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>right){
                validCount = 0;
                invalidIdx = i;

            }
            else if(nums[i]>=left){
                validCount = i-invalidIdx;
            }
            ans += validCount;
        }
        return ans;
    }
}