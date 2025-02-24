#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> leftPrefixMax(n), rightPrefixMax(n), ans(n - k + 1);

        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                leftPrefixMax[i] = nums[i];
            } else {
                leftPrefixMax[i] = max(leftPrefixMax[i - 1], nums[i]);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || i % k == k - 1) {
                rightPrefixMax[i] = nums[i];
            } else {
                rightPrefixMax[i] = max(rightPrefixMax[i + 1], nums[i]);
            }
        }

        for (int i = 0; i < n - k + 1; i++) {
            ans[i] = max(rightPrefixMax[i], leftPrefixMax[i + k - 1]);
        }
        return ans;
    }
};

int main() {
    int n, k;
    cin >> n >> k;

    vector<int> nums(n);
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    Solution solution;
    vector<int> result = solution.maxSlidingWindow(nums, k);

    for (int val : result) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
