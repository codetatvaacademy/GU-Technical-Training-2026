class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        for (int j = 0; j < n-1; j++) {
            if (nums[j] != nums[j + 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        nums[i++] = nums[n - 1];
        return i;
    }
}