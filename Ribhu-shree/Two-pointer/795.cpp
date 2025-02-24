class Solution {
    public:
        int numSubarrayBoundedMax(vector<int>& nums, int left, int right) {
            int l = 0;
            int totalcount = 0; 
            int count = 0;      
    
            for (int r = 0; r < nums.size(); r++) {
                if (nums[r] > right) {
                    l = r + 1; 
                    count = 0;
                } else {
                    if (nums[r] >= left) {
                        count = (r - l + 1); 
                    }
                    totalcount += count; 
                }
            }
            return totalcount;
        }
    };