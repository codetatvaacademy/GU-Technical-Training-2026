class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) 
        return new int[0];

        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] ans = new int[n - k + 1];

        
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                leftMax[i] = nums[i]; 
            } else {
                leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
            }
        }

        
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0) {
                rightMax[i] = nums[i]; 
            } else {
                rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
            }
        }

        
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }

        return ans;
    }
}
