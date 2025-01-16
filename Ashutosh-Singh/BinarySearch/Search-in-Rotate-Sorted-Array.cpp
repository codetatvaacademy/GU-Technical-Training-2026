#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int search(vector<int>& arr, int k) {
        int n = arr.size();
        int low = 0;
        int hi = n - 1;

        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (arr[mid] == k) return mid;

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && arr[mid] >= k) {
                    hi = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                if (arr[mid] <= k && arr[hi] >= k) {
                    low = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
};

int main() {
    int n, target;

    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the rotated sorted array: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter the target value: ";
    cin >> target;

    Solution solution;
    int result = solution.search(nums, target);

    if (result == -1) {
        cout << "Target " << target << " not found in the array.\n";
    } else {
        cout << "Target " << target << " found at index: " << result << endl;
    }

    return 0;
}
