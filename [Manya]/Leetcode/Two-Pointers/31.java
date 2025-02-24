class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int j = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            for (int i = 0; i < n / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[n - 1 - i];
                nums[n - 1 - i] = temp;
            }
            return;
        }

        for (int i = n - 1; i > j; i--) {
            if (nums[i] > nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        int start = j + 1;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
