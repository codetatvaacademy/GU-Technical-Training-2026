class Solution {
    public:
        // using exmple [5,7,7,8,8,10], target = 8
        vector<int> searchRange(vector<int>& nums, int target) {
    
            // Approach used : Binary Search
    
            int l = 0;
            int r = nums.size() - 1;
            int first = -1;
            int last = -1;
    
            // For finding the first occurrence
            while (l <= r) {
                int mid = l + (r - l) / 2;
    
                if (nums[mid] == target) {
                    first = mid;
                    r = mid - 1; // Continue searching left
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
    
            l = 0;
            r = nums.size() - 1;
            // For finding the last occurrence
            while (l <= r) {
                int mid = l + (r - l) / 2;
    
                if (nums[mid] == target) {
                    last = mid;
                    l = mid + 1;
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
    
            vector<int> ans;
            ans.push_back(first);
            ans.push_back(last);
            return ans;
        }
    };