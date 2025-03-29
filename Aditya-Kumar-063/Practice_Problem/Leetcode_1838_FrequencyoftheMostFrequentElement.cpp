#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Function to find the best possible subarray with max frequency
int findBest(int target_idx, int k, vector<int>& nums, vector<long>& prefixSum) {
    int target = nums[target_idx];
    int i = 0, j = target_idx, result = target_idx;

    while (i <= j) {
        int mid = i + (j - i) / 2;

        long count = (target_idx - mid + 1);
        long windowSum = (count * target);
        long currSum = prefixSum[target_idx] - prefixSum[mid] + nums[mid];

        int ops = windowSum - currSum;

        if (ops > k) {
            i = mid + 1;
        } else {
            result = mid;
            j = mid - 1;
        }
    }

    return target_idx - result + 1;
}

// Function to compute the maximum frequency
int maxFrequency(vector<int>& nums, int k) {
    int n = nums.size();
    sort(begin(nums), end(nums));

    vector<long> prefixSum(n);
    prefixSum[0] = nums[0];

    for (int i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - 1] + nums[i];
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
        result = max(result, findBest(i, k, nums, prefixSum));
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
