#include <iostream>
#include <vector>
using namespace std;

class NumArray {
public:
    vector<int>& preSum;

    NumArray(vector<int>& nums) : preSum(nums) {
        for (int i = 1; i < preSum.size(); ++i)
            preSum[i] += preSum[i-1];
    }

    int sumRange(int left, int right) {
        if (left == 0) return preSum[right];
        return preSum[right] - preSum[left-1];
    }
};

int main() {
    // Input array
    vector<int> nums = {1, 2, 3, 4, 5};

    // Create an object of NumArray
    NumArray* obj = new NumArray(nums);

    // Test sumRange queries
    cout << "Sum of range [0, 2]: " << obj->sumRange(0, 2) << endl; // Expected: 6
    cout << "Sum of range [1, 4]: " << obj->sumRange(1, 4) << endl; // Expected: 14
    cout << "Sum of range [0, 4]: " << obj->sumRange(0, 4) << endl; // Expected: 15

    // Clean up
    delete obj;

    return 0;
}
