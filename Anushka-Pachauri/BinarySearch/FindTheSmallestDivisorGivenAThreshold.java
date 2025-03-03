class FindTheSmallestDivisorGivenAThreshold {
    public boolean isValid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceilDiv(num, divisor);
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = 1000000;
        int min = 1;
        while (min < max) {
            int mid = (min + max) / 2;
            if (isValid(nums, mid, threshold)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}