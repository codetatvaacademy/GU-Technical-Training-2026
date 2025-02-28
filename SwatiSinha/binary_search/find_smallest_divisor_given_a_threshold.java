class Solution {
    private boolean isValid(int[] nums, int divisor, int threshold) {
        for (int num : nums) {
            threshold -= num / divisor;
            if (num % divisor != 0) {
                threshold--;
            }
        }
        return threshold >= 0;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        while (min < max) {
            int mid = (min + max) / 2;
            if (isValid(nums, mid, threshold)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return max;
    }
}