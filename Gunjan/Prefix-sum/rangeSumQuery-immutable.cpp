class NumArray {
public:
    vector<int> prefixSum;
    
    NumArray(vector<int>& nums) {
        int count = nums[0];
        prefixSum.push_back(nums[0]);

        for (int i = 1; i < nums.size(); i++) {
            prefixSum.push_back(nums[i] + count);
            count += nums[i];
        }
    }
    
    int sumRange(int left, int right) {
        if (left > 0)
            return prefixSum[right] - prefixSum[left - 1];

        return prefixSum[right]; 
    }
};
