#include <iostream>
#include <vector>

using namespace std;

// Function to count subarrays with product less than k
int numSubarrayProductLessThanK(vector<int>& nums, int k) {
    if (k <= 1) return 0; // If k is 1 or less, no subarray can have a product < k

    int prod = 1, count = 0;
    int i = 0; // Left pointer for the sliding window

    for (int j = 0; j < nums.size(); ++j) {
        prod *= nums[j];

        // Shrink the window until the product is less than k
        while (prod >= k && i <= j) {
            prod /= nums[i];
            i++;
        }

        // All subarrays ending at j and starting from i to j are valid
        count += (j - i + 1);
    }

    return count;
}

int main() {
    int n, k;
    cout << "Enter number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter value of k: ";
    cin >> k;

    int result = numSubarrayProductLessThanK(nums, k);
    cout << "Number of subarrays with product less than " << k << ": " << result << endl;

    return 0;
}
