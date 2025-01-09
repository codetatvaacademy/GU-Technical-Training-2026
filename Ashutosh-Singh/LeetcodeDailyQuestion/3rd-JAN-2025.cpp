#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        int n = nums.size();
        long long TotalSum = 0;
        long long leftSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            TotalSum += nums[i];
        }

        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            long long rightSum = TotalSum - leftSum;
            if (leftSum >= rightSum) {
                count++;
            }
        }
        return count;
    }
};

int main() {
    Solution solution;
    int n;

    // Input number of elements
    cout << "Enter number of elements: ";
    cin >> n;
    vector<int> nums(n);

    cout << "Enter elements: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    // Calculate and output the result
    int result = solution.waysToSplitArray(nums);
    cout << "Number of ways to split the array: " << result << endl;

    return 0;
}
