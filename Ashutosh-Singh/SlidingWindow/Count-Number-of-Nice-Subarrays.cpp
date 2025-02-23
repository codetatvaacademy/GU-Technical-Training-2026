#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numberOfSubarraysLessThan_K(vector<int>& nums, int k) {
        int left = 0, right = 0, sum = 0, count = 0;

        if (k < 0) return 0; 

        while (right < nums.size()) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            count += (right - left + 1);
            right++;
        }

        return count;
    }

    int numberOfSubarrays(vector<int>& nums, int k) {
        for (int i = 0; i < nums.size(); i++) {
            nums[i] = (nums[i] % 2 == 0) ? 0 : 1;
        }

        return numberOfSubarraysLessThan_K(nums, k) - numberOfSubarraysLessThan_K(nums, k - 1);
    }
};

int main() {
    Solution solution;

    vector<int> nums = {1, 1, 2, 1, 1};
    int k = 3;

    int result = solution.numberOfSubarrays(nums, k);
    cout << "Number of subarrays with exactly " << k << " odd numbers: " << result << endl;

    return 0;
}
