#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int firstOccurence(vector<int>& arr, int n, int k) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == k) {
                ans = mid;
                e = mid - 1; // Search on the left half
            } else if (arr[mid] < k) {
                s = mid + 1; // Search on the right half
            } else {
                e = mid - 1; // Search on the left half
            }
        }
        return ans;
    }

    int lastOccurence(vector<int>& arr, int n, int k) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == k) {
                ans = mid;
                s = mid + 1; // Search on the right half
            } else if (arr[mid] < k) {
                s = mid + 1; // Search on the right half
            } else {
                e = mid - 1; // Search on the left half
            }
        }
        return ans;
    }

    int searchdiff(vector<int>& nums, int target) {
        int n = nums.size();
        int first = firstOccurence(nums, n, target);
        if (first == -1) {
            return 0; // Target not found
        }
        int second = lastOccurence(nums, n, target);
        return second - first + 1;
    }
};

int main() {
    Solution solution;
    vector<int> nums = {1, 2, 2, 2, 3, 4, 5};
    int target = 2;

    int result = solution.searchdiff(nums, target);
    cout << "The number of occurrences of " << target << " is: " << result << endl;

    return 0;
}