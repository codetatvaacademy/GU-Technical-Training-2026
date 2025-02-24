#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
        int n = arr.size();
        int sum = 0;
        int cnt = 0;

        // Calculate the sum of the first 'k' elements
        for(int right = 0; right < k; right++) {
            sum += arr[right];
        }

        // Check if the average of the first subarray meets the threshold
        if(sum / k >= threshold) {
            cnt++;
        }

        // Sliding window to calculate the sum of the remaining subarrays
        int left = 0, right = k;
        while(right < n) {
            sum -= arr[left];
            sum += arr[right];

            if(sum / k >= threshold) {
                cnt++;
            }

            left++;
            right++;
        }

        return cnt;
    }
};

int main() {
    Solution solution;

    // Test cases
    vector<int> arr1 = {2, 1, 3, 4, 1};
    int k1 = 3, threshold1 = 3;

    vector<int> arr2 = {1, 1, 1, 1, 1};
    int k2 = 1, threshold2 = 0;

    vector<int> arr3 = {4, 4, 4, 4};
    int k3 = 4, threshold3 = 4;

    cout << "Number of subarrays (Test 1): " << solution.numOfSubarrays(arr1, k1, threshold1) << endl;
    cout << "Number of subarrays (Test 2): " << solution.numOfSubarrays(arr2, k2, threshold2) << endl;
    cout << "Number of subarrays (Test 3): " << solution.numOfSubarrays(arr3, k3, threshold3) << endl;

    return 0;
}
