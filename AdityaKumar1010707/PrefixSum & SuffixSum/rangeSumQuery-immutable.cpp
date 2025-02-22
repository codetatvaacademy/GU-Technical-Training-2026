#include <iostream>
#include <vector>

using namespace std;

class NumArray {
public:
    vector<int> prefixSum;
    
    NumArray(vector<int>& nums) {
        int count = nums[0];
        prefixSum.push_back(nums[0]);

        for (int i = 1; i < nums.size(); i++) {
            prefixSum.push_back(nums[i] + count);
            count += nums[i];
        }
    }
    
    int sumRange(int left, int right) {
        if (left > 0)
            return prefixSum[right] - prefixSum[left - 1];

        return prefixSum[right]; 
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

    NumArray obj(nums);

    int left, right;
    cout << "Enter range (left right): ";
    cin >> left >> right;

    cout << "Sum in range [" << left << ", " << right << "]: " << obj.sumRange(left, right) << endl;

    return 0;
}
