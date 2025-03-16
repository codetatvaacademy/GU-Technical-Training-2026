class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        boolean val = false;

        while (end < nums.length) {
            sum += nums[end];

            while (sum >= target && start <= end) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
                val = true;
            }
            end++;
        }
        
        
        if (val) {
            return minLength;
        } else {
            return 0;
        }
    }
}

