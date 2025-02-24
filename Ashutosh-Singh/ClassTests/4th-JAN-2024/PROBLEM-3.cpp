#include <iostream>
#include <vector>
using namespace std;

class NumArray {
public:
    vector<int>& preSum;

    NumArray(vector<int>& nums) : preSum(nums) {
        for (int i = 1; i < preSum.size(); ++i)
            preSum[i] += preSum[i - 1];
    }

    int sumRange(int left, int right) {
        if (left == 0) return preSum[right];
        return preSum[right] - preSum[left - 1];
    }
};

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array:\n";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    // Create NumArray object
    NumArray numArray(nums);

    int q;
    cout << "Enter the number of queries: ";
    cin >> q;

    cout << "Enter the queries in the format [left, right]:\n";
    for (int i = 0; i < q; ++i) {
        int left, right;
        cin >> left >> right;
        cout << "Sum of range [" << left << ", " << right << "]: " << numArray.sumRange(left, right) << endl;
    }

    return 0;
}