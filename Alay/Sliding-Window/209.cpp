class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int start = 0, end = 0, minLen = nums.size() + 1, cost = 0;

        while (end < nums.size()) {
            cost += nums[end];

            while (cost >= target) {
                minLen = min(minLen, end - start + 1);
                cost -= nums[start];
                start++;
            }
            end++;
        }
        if(minLen == nums.size() + 1){
            return 0;
        }
        return minLen;
    }
};