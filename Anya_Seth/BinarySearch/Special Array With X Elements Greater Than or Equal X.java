class Solution {
    public int specialArray(int[] nums) {
     int n = nums.length;
        int low = 0;
        int high = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(nums, mid) == mid) {
                return mid;
            } else if (isPossible(nums, mid) > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    private int isPossible(int[] nums, int n) {
        int count = 0;
        for (int num : nums) {
            if (num >= n) {
                count++;
            }
        }
        return count;
    }
}
