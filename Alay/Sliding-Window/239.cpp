class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> leftMax(n), rightMax(n), result(n - k + 1);
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                leftMax[i] = nums[i];
            } else {
                leftMax[i] = max(leftMax[i - 1], nums[i]);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0) {
                rightMax[i] = nums[i];
            } else {
                rightMax[i] = max(rightMax[i + 1], nums[i]);
            }
        }
        for (int i = 0; i <= n - k; i++) {
            result[i] = max(rightMax[i], leftMax[i + k - 1]);
        }
        
        return result;
    }
};
