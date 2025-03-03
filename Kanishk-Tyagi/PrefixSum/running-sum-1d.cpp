class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int size = nums.size();
        vector<int>prefix(size);
        prefix[0]=nums[0];
        for(int i=1;i<size;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
};
