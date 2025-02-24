class Solution {
    public:
        vector<int> runningSum(vector<int>& nums) {
            vector<int> PrefixS(nums.size());
            PrefixS[0]=nums[0];
            for(int i=1;i<nums.size();i++){
                PrefixS[i]=PrefixS[i-1]+nums[i];
            }
            return PrefixS;
            
        }
    };