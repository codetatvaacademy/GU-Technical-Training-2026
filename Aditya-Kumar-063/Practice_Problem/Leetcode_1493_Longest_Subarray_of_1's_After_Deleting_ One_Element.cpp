#include <iostream>
#include <vector>
#include <algorithm> // For std::max
using namespace std;

// Function to find the length of the longest subarray
int longestSubarray(vector<int>& nums) {
    int zeroCount = 0;
    int longestWindow = 0;

    int i = 0;
    for (int j = 0; j < nums.size(); j++) {
        zeroCount += (nums[j] == 0);
                          
        // Shrink the window until the zero counts come under the limit.
        while (zeroCount > 1) {
            zeroCount -= (nums[i] == 0);
            i++;
        }
          
        longestWindow = max(longestWindow, j - i);
    }

    return longestWindow;
}

int main() {
    int n;

    // Input: Size of the array
    cout << "Enter the size of the array: ";
    cin >> n;

    vector<int> nums(n);

    // Input: Array elements
    cout << "Enter the elements of the array (0s and 1s): ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // Calculate the longest subarray
    int result = longestSubarray(nums);

    // Output the result
    cout << "The length of the longest subarray is: " << result << endl;

    return 0;
}
