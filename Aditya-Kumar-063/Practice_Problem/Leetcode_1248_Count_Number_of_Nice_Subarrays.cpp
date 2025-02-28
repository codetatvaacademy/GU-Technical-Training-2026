#include <iostream>
#include <vector>
using namespace std;

// Helper function to count subarrays with at most 'k' odd numbers
int countAtMostKOdd(vector<int>& nums, int k) {
    if (k < 0) // If k is negative, there can't be any valid subarrays
        return 0;

    int l = 0, r = 0;  // Two pointers for sliding window
    int sum = 0;       // Tracks the count of odd numbers in the current window
    int count = 0;     // Counts the valid subarrays

    // Iterate through the array using the right pointer
    while (r < nums.size()) { // Ensure we don't go out of bounds
        sum += nums[r] % 2; // Add 1 to sum if nums[r] is odd, 0 otherwise

        // If the count of odd numbers exceeds k, shrink the window from the left
        while (sum > k) {
            sum -= nums[l] % 2; // Subtract 1 from sum if nums[l] is odd
            l++;                // Move the left pointer to the right
        }

        // Add the number of valid subarrays ending at index 'r'
        count += (r - l + 1);

        r++; // Move the right pointer to the next element
    }

    return count; // Return the total count of valid subarrays
}

// Function to count the number of subarrays with exactly 'k' odd numbers
int numberOfSubarrays(vector<int>& nums, int k) {
    // The number of subarrays with exactly 'k' odd numbers
    // is the difference between subarrays with at most 'k' odd numbers
    // and subarrays with at most 'k-1' odd numbers
    return countAtMostKOdd(nums, k) - countAtMostKOdd(nums, k - 1);
}

// Main function for user input
int main() {
    int n, k;

    // Taking input for the size of the array
    cout << "Enter the size of the array: ";
    cin >> n;

    vector<int> nums(n); // Create a vector of size n

    // Taking input for the array elements
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // Taking input for the value of k
    cout << "Enter the value of k: ";
    cin >> k;

    // Call the function and display the result
    int result = numberOfSubarrays(nums, k);
    cout << "Number of subarrays with exactly " << k << " odd numbers: " << result << endl;

    return 0;
}
