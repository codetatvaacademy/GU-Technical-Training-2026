class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int result = nums[nums.length - 1] - nums[0];
        int bestL = nums[0] + k;
        int bestR = nums[nums.length - 1] - k;
        int i = 0;
        while(i < nums.length - 1){
            int min = Math.min(bestL, nums[i+1] - k);
            int max = Math.max(bestR, nums[i] + k);
            result = Math.min(result, max - min);
            i++;
        }
        return result;
    }
}
