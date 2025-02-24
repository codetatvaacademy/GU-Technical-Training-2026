
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> arr(nums.size(), 0);
        arr[0] = nums[0];

        for (int i = 1; i < nums.size(); i++) {
            arr[i] = nums[i] + arr[i - 1];
        }
        
        return arr;
    }
};
