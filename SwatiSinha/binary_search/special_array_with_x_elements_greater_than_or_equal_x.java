class Solution {
    public int countGreaterOrEqual(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num >= target) {
                count++;
            }
        }
        return count;
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        int max = nums.length;
        while (min <= max) {
            int mid = (min + max) / 2;
            int count = countGreaterOrEqual(nums, mid);
            if (count == mid) {
                return mid;
            } else if (count < mid) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}