#include <iostream>
#include <vector>
#include <numeric> // For std::accumulate
#include <algorithm> // For std::max
using namespace std;

// Function to calculate the minimum swaps required
int minSwaps(vector<int>& nums) {
    int n = nums.size();
    int countOnes = accumulate(begin(nums), end(nums), 0);

    int i = 0;
    int j = 0;
    int currCount = 0;
    int maxCount = 0;

    while (j < 2 * n) {
        if (nums[j % n] == 1) {
            currCount++;
        }

        if (j - i + 1 > countOnes) {
            currCount -= nums[i % n];
            i++;
        }

        maxCount = max(maxCount, currCount);
        j++;
    }

    return countOnes - maxCount;
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

    // Calculate the minimum swaps
    int result = minSwaps(nums);

    // Output the result
    cout << "The minimum number of swaps required is: " << result << endl;

    return 0;
}
