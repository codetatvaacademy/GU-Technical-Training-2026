class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int max = 0;
        int sum = 0;
        int maxSum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] index = new int[max + 1];
        while (end < nums.length) {
            sum += nums[end];
            index[nums[end]]++;
            while (index[nums[end]] > 1) {
                index[nums[start]]--;
                sum -= nums[start];
                start++;
            }
            maxSum = Math.max(sum, maxSum);
            end++;
        }
        return maxSum;
    }
}