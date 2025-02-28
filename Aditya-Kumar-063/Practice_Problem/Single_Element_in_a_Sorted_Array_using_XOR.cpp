#include <iostream>
#include <vector>

using namespace std;

// Function to find the single non-duplicate element using XOR
int singleNonDuplicate(vector<int>& nums) {
    int xor_Value = 0;

    for (int num : nums) {
        xor_Value ^= num;
    }

    return xor_Value;
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the sorted array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    int result = singleNonDuplicate(nums);
    cout << "The single non-duplicate element is: " << result << endl;

    return 0;
}
