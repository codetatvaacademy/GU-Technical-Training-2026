#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function to find the longest contiguous subarray with at most k zeros flipped
int longestOnes(vector<int>& nums, int k) {
    int n = nums.size(); // Size of the array
    int l = 0, r = 0, zeros = 0, maxLen = 0;

    while (r < n) {
        // If the current element is 0, increment the zero count
        if (nums[r] == 0) {
            zeros++;
        }

        // If the number of zeros exceeds k, move the left pointer
        while (zeros > k) {
            if (nums[l] == 0) {
                zeros--;
            }
            l++; // Increment the left pointer
        }

        // Calculate the length of the current window and update maxLen
        maxLen = max(maxLen, r - l + 1);

        // Move the right pointer
        r++;
    }

    return maxLen;
}

int main() {
    int n, k;

    // Input the size of the array and the value of k
    cout << "Enter the size of the array: ";
    cin >> n;

    vector<int> nums(n);

    // Input the elements of the array
    cout << "Enter the elements of the array (0 or 1): ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // Input the number of flips allowed
    cout << "Enter the maximum number of flips allowed (k): ";
    cin >> k;

    // Find the length of the longest subarray
    int result = longestOnes(nums, k);

    // Output the result
    cout << "The length of the longest subarray with at most " << k << " flips is: " << result << endl;

    return 0;
}
