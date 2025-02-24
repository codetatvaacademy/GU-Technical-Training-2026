#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int sum = -x;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i];
        }
        if (sum < 0) return -1;

        if (sum == 0) return nums.size();
        int st = 0, end = 0, maxLength = 0;

        while (end < nums.size()) {
            sum -= nums[end];

            while (sum < 0) {
                sum += nums[st++];
            }

            if (sum == 0) {
                maxLength = max(maxLength, end - st + 1);
            }
            end++;
        }
        return maxLength == 0 ? -1 : nums.size() - maxLength;
    }
};

int main() {
    int n, x;
    cin >> n >> x;

    vector<int> nums(n);
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    Solution solution;
    cout << solution.minOperations(nums, x) << endl;

    return 0;
}
