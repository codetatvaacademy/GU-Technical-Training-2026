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
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    NumArray* obj = new NumArray(nums);

    int q;
    cout << "Enter the number of queries: ";
    cin >> q;

    for (int i = 0; i < q; ++i) {
        int left, right;
        cout << "Enter the range (left and right): ";
        cin >> left >> right;

        int result = obj->sumRange(left, right);
        cout << "Sum of elements in the range [" << left << ", " << right << "] is: " << result << endl;
    }

    delete obj; // Clean up the allocated memory
    return 0;
}
