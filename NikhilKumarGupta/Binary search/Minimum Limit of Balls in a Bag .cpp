class Solution {
    public:
         int maxEl(vector<int>& nums) {
            int maxi = INT_MIN;
            for (int i = 0; i < nums.size(); i++) {
                maxi = max(maxi, nums[i]);
            }
            return maxi;
        }
    
        long long totEl(vector<int>& nums, int mid) {
            long long totH = 0;
            int n = nums.size();
    
            for (int i = 0; i < n; i++) {
                totH += ((nums[i] + mid - 1) / mid)-1; 
            }
            return totH;
        }
        int minimumSize(vector<int>& nums, int maxOperations) {
             int low = 1;
            long long high = maxEl(nums);
            int ans = INT_MAX;
    
            while (low <= high) {
                int mid = (low + high) / 2;
                long long totHr = totEl(nums, mid);
                if (totHr <= maxOperations) {
                    ans =mid;
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return ans;
        }
        
    };