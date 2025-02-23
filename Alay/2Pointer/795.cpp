class Solution {
public:
    int numSubarrayBoundedMax(vector<int>& nums, int left, int right) {
        int count = 0;
        int current_count = 0;
        for (int num : nums) {
            if (num >= left && num <= right) {
                current_count++;
                count += current_count;
            } else if (num < left) {
                count += current_count;
            } else {
                current_count = 0;
            }
        }
        return count;
    }
};