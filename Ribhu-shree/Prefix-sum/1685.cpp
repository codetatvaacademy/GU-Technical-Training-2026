class Solution {
    public:
        vector<int> getSumAbsoluteDifferences(vector<int>& nums) {
            int n = nums.size();
            vector<int> result(n, 0);
            vector<int> prefix(n, 0);
            vector<int> suffix(n, 0);
            
            prefix[0] = 0;  
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + nums[i - 1];
            }
    
            suffix[n - 1] = 0;  
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] + nums[i + 1];
            }
    
    
            for (int i = 0; i < n; i++) {
                result[i] = (i * nums[i]) - prefix[i] + suffix[i] - (n - i - 1) * nums[i];
            }
    
            return result;
        }
    };