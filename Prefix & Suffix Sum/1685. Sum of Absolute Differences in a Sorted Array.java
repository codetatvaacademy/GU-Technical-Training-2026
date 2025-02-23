class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] pri = new int[n];
        pri[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pri[i] = nums[i] + pri[i - 1];

        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int leftsum = pri[i] - nums[i];
            int rightsum = pri[n - 1] - pri[i];
            int leftc = i;
            int rightc = n - 1 - i;
            int leftans = nums[i] * leftc - leftsum;
            int rightans = rightsum - rightc * nums[i];
            ans[i] = leftans + rightans;

        }
        return ans;

    }
}