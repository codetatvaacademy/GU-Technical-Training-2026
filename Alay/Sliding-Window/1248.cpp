class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int count = 0, oddCount = 0, left = 0, right = 0;
        int n = nums.size();
        int prefixCount = 0;

        while (right < n) {
            if (nums[right] % 2 == 1) {
                oddCount++;
                prefixCount = 0;
            }
            while (oddCount == k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                prefixCount++;
                left++;
            }
            count += prefixCount;
            right++;
        }

        return count;
    }
};