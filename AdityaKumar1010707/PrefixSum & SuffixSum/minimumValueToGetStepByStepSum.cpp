#include <iostream>
#include <vector>
#include <limits.h>
#include <cmath>

using namespace std;

class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int minPrefixSum = INT_MAX;
        int runningSum = 0;

        for (int num : nums) {
            runningSum += num;
            minPrefixSum = min(minPrefixSum, runningSum);
        }

        return (minPrefixSum < 0) ? abs(minPrefixSum) + 1 : 1;
    }
};

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    Solution obj;
    int result = obj.minStartValue(nums);

    cout << "Minimum start value required: " << result << endl;

    return 0;
}
