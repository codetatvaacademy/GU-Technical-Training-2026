class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int n = nums.size();
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum < x) {
            return -1; 
        }

        int target = totalSum - x; 
        int left = 0, right = 0, currSum = 0, maxLen = 0;

        while (right < n) {
            currSum += nums[right];

            while (left <= right && currSum > target) {
                currSum -= nums[left];
                left++;
            }

            if (currSum == target) {
                maxLen = max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen == -1 ? -1 : n - maxLen; 
    }
};
