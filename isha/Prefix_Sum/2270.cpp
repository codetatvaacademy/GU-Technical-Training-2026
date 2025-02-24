class Solution {
    public:
        int waysToSplitArray(vector<int>& nums) {
             int n = nums.size();
            long long totalSum = 0;
            long long leftSum = 0;
            int validSplits = 0;
    
            for (int i = 0; i < n; i++) {
                totalSum += nums[i];
            }
    
            for (int i = 0; i < n - 1; i++) {
                leftSum += nums[i];
                long long rightSum = totalSum - leftSum;
                if (leftSum >= rightSum) {
                    validSplits++;
                }
            }
    
            return validSplits;
            
        }
    };