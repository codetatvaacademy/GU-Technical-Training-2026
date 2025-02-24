#include <iostream>
#include <vector>
#include <algorithm> // For max function

using namespace std;

class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n = nums.size();
        int zeroCnt = 0;
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < n; ++right) {
            if (nums[right] == 0) {
                zeroCnt++;
            }
            while (zeroCnt > k) {
                if (nums[left] == 0) {
                    zeroCnt--;
                }
                left++;
            }
            maxLen = max(maxLen, right - left + 1);
        }

        return maxLen;
    }
};

int main() {
    // Example input
    vector<int> nums;
    int k;

    // Input for nums array
    cout << "Enter the size of the array: ";
    int n;
    cin >> n;

    cout << "Enter the elements of the array (0 or 1): ";
    nums.resize(n);
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    // Input for k
    cout << "Enter the maximum number of 0s allowed to flip (k): ";
    cin >> k;

    // Create Solution object and call the function
    Solution sol;
    int result = sol.longestOnes(nums, k);

    // Output the result
    cout << "The longest subarray with at most " << k << " zeros is of length: " << result << endl;

    return 0;
}
