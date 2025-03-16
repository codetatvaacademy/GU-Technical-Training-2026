#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Function to compute the maximum frequency using sliding window
int maxFrequency(vector<int>& nums, int k) {
    sort(begin(nums), end(nums));

    int n = nums.size();
    int result = 0;
    int i = 0;
    long currSum = 0;

    for (int j = 0; j < n; j++) {
        long target = nums[j];
        currSum += nums[j];

        while ((j - i + 1) * target - currSum > k) {
            currSum -= nums[i];
            i++;
        }

        result = max(result, j - i + 1);
    }
    return result;
}

int main() {
    int n, k;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter the number of operations allowed (k): ";
    cin >> k;

    int result = maxFrequency(nums, k);
    cout << "Maximum frequency of any element after " << k << " operations: " << result << endl;

    return 0;
}
