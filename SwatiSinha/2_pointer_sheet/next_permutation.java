class Solution {
    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int end = nums.length - 2;
        while (end >= 0 && nums[end] >= nums[end + 1]) {
            end--;
        }
        if (end != -1) {
            int swap = end + 1;
            while (swap < nums.length && nums[end] < nums[swap]) {
                swap++;
            }
            swap--;
            int t = nums[end];
            nums[end] = nums[swap];
            nums[swap] = t;
        }
        reverse(nums, end + 1, nums.length - 1);
    }
}
