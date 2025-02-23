class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        prefix[0] = nums[0];
        for (int i = 1; i < n; ++i)
            prefix[i] = prefix[i - 1] + nums[i];

        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; ++i) {
            leftSum = prefix[i] * nums[i] * (i+1);
            rightSum = sum - prefix[i] * nums[i] * (n - i + 2);
            ans[i] = Math.abs(leftSum - rightSum);
        }
        return ans;
    }
}
