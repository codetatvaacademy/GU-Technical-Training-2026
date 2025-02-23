class SplitArrayLargestSum {
    public static boolean isValid(int[] nums, int maxSum, int k) {
        int count = 1;
        int currentSum = 0;
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = num;
                if (count > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        return count <= k;
    }

    public int splitArray(int[] nums, int k) {
        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int num : nums) {
            max += num;
            min = Math.max(min, num);
        }
        if (nums.length == 0) {
            return 0;
        }
        if (k == 0) {
            return max;
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isValid(nums, mid, k)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;

    }
}