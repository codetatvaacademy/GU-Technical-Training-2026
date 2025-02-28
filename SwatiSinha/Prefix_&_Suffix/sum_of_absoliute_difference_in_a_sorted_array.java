public class sum_of_absoliute_difference_in_a_sorted_array {
    class Solution {
        public int[] getSumAbsoluteDifferences(int[] nums) {
            int n = nums.length;
            int suffix[] = new int[n];
            int preCount = 0;
            suffix[n - 1] = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = nums[i] + suffix[i + 1];
            }
            for (int i = 0; i < n; i++) {
                preCount += nums[i];
                nums[i] = ((i + 1) * nums[i] - preCount) + (suffix[i] - nums[i] * (n - i));
            }
            return nums;
        }
    }
}
