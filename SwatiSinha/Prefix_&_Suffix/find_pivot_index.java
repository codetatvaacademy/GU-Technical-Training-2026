public class find_pivot_index {
    class Solution {
        public int pivotIndex(int[] nums) {
            int n = nums.length;
            int[] prefix = new int[n + 1];
            int[] suffix = new int[n + 1];
            prefix[0] = 0;
            suffix[n] = 0;
            for (int i = 1; i <= n; i++) {
                prefix[i] = nums[i - 1] + prefix[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                suffix[i] += nums[i] + suffix[i + 1];
            }
            for (int i = 0; i < n; i++) {
                if (prefix[i] == suffix[i + 1]) {
                    return i;
                }
            }
            return -1;
        }
    }
}
