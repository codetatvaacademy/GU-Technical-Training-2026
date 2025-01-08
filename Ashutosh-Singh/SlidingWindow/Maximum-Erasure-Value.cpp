#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int n = nums.size();
        int sum = 0;
        int maxSum = 0;
        unordered_set<int> uniqueSet;

        int left = 0;
        for (int right = 0; right < n; ++right) {
            while (uniqueSet.find(nums[right]) != uniqueSet.end()) {
                uniqueSet.erase(nums[left]);
                sum -= nums[left];
                ++left;
            }
            uniqueSet.insert(nums[right]);
            sum += nums[right];
            maxSum = max(maxSum, sum);
        }
        return maxSum;
    }
};

int main() {
    Solution solution;

    // Example input
    vector<int> nums = {4, 2, 4, 5, 6};

    // Calculate the maximum unique subarray sum
    int result = solution.maximumUniqueSubarray(nums);

    // Output the result
    cout << "Maximum Unique Subarray Sum: " << result << endl;

    return 0;
}
