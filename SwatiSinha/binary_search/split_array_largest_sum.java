class Solution {
    public boolean isValid(int[] nums, int mid, int k) {
        k--;
        int sum = 0;
        for (int num : nums) {
            if (num > mid) {
                return false;
            } else if (num + sum > mid) {
                k--;
                sum = 0;
            }
            sum += num;
        }
        return k >= 0;
    }

    public int splitArray(int[] nums, int k) {
        int min = 1;
        int max = 0;
        for (int num : nums) {
            max += num;
        }
        if(nums.length<=1){
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