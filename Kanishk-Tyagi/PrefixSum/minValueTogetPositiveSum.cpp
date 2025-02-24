class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int minSum=0;
        int totalSum=0;
        for(int i=0;i<nums.size();i++){
            totalSum+=nums[i];
            minSum=min(minSum,totalSum);
        }
        return 1-minSum;
    }
};
