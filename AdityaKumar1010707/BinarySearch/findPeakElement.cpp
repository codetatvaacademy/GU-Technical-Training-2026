class Solution {
    public:
        int recurBS(int l, int r, vector<int>& nums) {
            if (l > r)
                return -1;
    
            int mid = (l + r) / 2;
            // Checking boundaries and checking if greater than left and right
            // number (Condition to be a peak )
            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                (mid == nums.size() - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }
            // A peak must be on left
            else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return recurBS(l, mid - 1, nums);
            } 
            // A peak must be on right
            else
                return recurBS(mid + 1, r, nums);
        }
    
        int findPeakElement(vector<int>& nums) {
    
            int l = 0;
            int r = nums.size() - 1;
    
            return recurBS(l, r, nums);
        }
    };