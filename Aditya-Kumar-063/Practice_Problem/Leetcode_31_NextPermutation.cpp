#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function to find the next lexicographical permutation
void nextPermutation(vector<int>& nums) {
    int n = nums.size();
    int i = n - 2;

    // Step 1: Find the first decreasing element from the right
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    // Step 2: If a decreasing element was found
    if (i >= 0) {
        int j = n - 1;

        // Find the smallest element larger than nums[i] in the right subarray
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Swap nums[i] and nums[j]
        swap(nums[i], nums[j]);
    }

    // Step 3: Reverse the subarray to the right of index i
    reverse(nums.begin() + i + 1, nums.end());
}

int main() {
    int n;

    // Input the size of the array
    cout << "Enter the size of the array: ";
    cin >> n;

    vector<int> nums(n);

    // Input the elements of the array
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // Find the next permutation
    nextPermutation(nums);

    // Output the next permutation
    cout << "Next permutation: ";
    for (int num : nums) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
