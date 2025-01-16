#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> output(n);
        
        // Initialize the output array with the product of elements to the left of each element
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Now, multiply by the product of elements to the right of each element
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        
        return output;
    }
};

int main() {
    Solution sol;

    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);

    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    vector<int> result = sol.productExceptSelf(nums);

    cout << "The result is: ";
    for (const int& val : result) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
