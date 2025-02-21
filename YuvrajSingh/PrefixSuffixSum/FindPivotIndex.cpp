class Solution {
    public:
        int pivotIndex(vector<int>& nums) {
        int n = nums.size();
        int ans = -1;
        vector<int> prefix(n, 0);
        vector<int> suffix(n, 0);
    
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    
        suffix[n - 1] = nums[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            suffix[j] = suffix[j + 1] + nums[j];
        }
    
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = (i == n - 1) ? 0 : suffix[i + 1];
            if (leftSum == rightSum) {
                return i; 
            }
        }
    
        return ans;  
    }
    
    };