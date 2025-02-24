class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int minPrefixSum = INT_MAX;
        int runningSum = 0;

        for (int num : nums) {
            runningSum += num;
            minPrefixSum = min(minPrefixSum, runningSum);
        }

        return (minPrefixSum < 0) ? abs(minPrefixSum) + 1 : 1;
    }
};
