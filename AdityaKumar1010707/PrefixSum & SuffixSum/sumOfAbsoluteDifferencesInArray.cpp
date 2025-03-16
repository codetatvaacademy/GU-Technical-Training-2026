#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> getSumAbsoluteDifferences(vector<int>& nums) {
        int n = nums.size();
        vector<int> arr(n, 0);

        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }

        vector<int> ans(n, 0);
        for (int i = 0; i < n; i++) {
            int leftSum = arr[i] - nums[i];
            int rightSum = arr[n - 1] - arr[i];
            int eleLeft = i;
            int eleRight = (n - 1) - i;
            int val = abs(leftSum - (eleLeft * nums[i])) + abs(rightSum - (eleRight * nums[i]));
            ans[i] = val;
        }

        return ans;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {2, 3, 5};
    vector<int> result = sol.getSumAbsoluteDifferences(nums);

    for (int val : result) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
