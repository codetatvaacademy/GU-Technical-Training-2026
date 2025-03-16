class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int res = nums[nums.length - 1] - nums[0];
        int bestL = nums[0] + k;
        int bestR = nums[nums.length - 1] - k;
        int min = 0;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(nums[i + 1] - k, bestL);
            max = Math.max(nums[i] + k, bestR);
            
            if (max - min < res) {
                res = max - min;
            }
        }

        return res;
    }

}
