class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        k %= n + 1;
        reverse(nums, 0, n);
        reverse(nums, 0, k-1);
        reverse(nums, k, n);
    }

    public void reverse(int[] nums, int left, int right) {
        int temp = 0;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}