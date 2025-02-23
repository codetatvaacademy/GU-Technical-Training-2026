class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int n = nums.size();
        unordered_set<int> seen;
        int left = 0, right = 0, sum = 0, max_sum = 0;
        
        while (right < n) {
            while (seen.count(nums[right])) {
                seen.erase(nums[left]);
                sum -= nums[left];
                left++;
            }
            
            seen.insert(nums[right]);
            sum += nums[right];
            max_sum = max(max_sum, sum);
            right++;
        }
        
        return max_sum;
    }
};