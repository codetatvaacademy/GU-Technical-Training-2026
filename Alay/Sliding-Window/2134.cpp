class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }
        if (totalOnes == 0) return 0;
        int n = nums.size();
        int currentOnes = 0;
        int minSwaps = INT_MAX;
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }
        minSwaps = totalOnes - currentOnes;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == 1) {
                currentOnes--;
            }
            if (nums[(i + totalOnes - 1) % n] == 1) {
                currentOnes++;
            }
            minSwaps = min(minSwaps, totalOnes - currentOnes);
        }

        return minSwaps;

    }
};