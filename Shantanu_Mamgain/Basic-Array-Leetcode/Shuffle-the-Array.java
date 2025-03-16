class Solution { 
    public void rotate(int nums[], int start, int end) {
        int temp = nums[end];
        for (int i = end; i > start; i--) {
            nums[i] = nums[i - 1];
        }
        nums[start] = temp;
    }

    public int[] shuffle(int[] nums, int n) {
        int j = n;
        for (int i = 1; i < nums.length - 2; i = i + 2) {
            rotate(nums, i, j);
            j++;
        }
        return nums;
    }
}
