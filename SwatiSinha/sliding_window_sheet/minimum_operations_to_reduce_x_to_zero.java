class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int target = (sum - x);
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return nums.length;
        }
        int start = 0, length = -1, end = 0;
        while (end < nums.length) {
            target -= nums[end];
            while (start <= end && target < 0) {
                target += nums[start];
                start++;
            }
            if (target == 0) {
                length = Math.max(length, end - start + 1);
            }
            end++;
        }
        return (length == -1) ? -1 : (nums.length - length);
    }
}