#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, res = 0, left = 0;

        for (int right = 0; right < nums.size(); right++) {
            prod *= nums[right];

            while (prod >= k) {
                prod /= nums[left];
                left++;
            }

            res += right - left + 1;
        }
        return res;
    }
};

int main() {
    Solution solution;

    // Example input
    vector<int> nums = {10, 5, 2, 6};
    int k = 100;

    // Calculate the number of subarrays with product less than k
    int result = solution.numSubarrayProductLessThanK(nums, k);

    // Output the result
    cout << "Number of Subarrays with Product Less Than " << k << ": " << result << endl;

    return 0;
}
