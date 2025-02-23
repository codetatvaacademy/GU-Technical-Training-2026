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

    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        vector<int> ans;
        int first = firstOccurence(nums, n, target);
        int second = lastOccurence(nums, n, target);
        ans.push_back(first);
        ans.push_back(second);
        return ans;
    }
};

int main() {
    int n, target;

    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array (sorted): ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter the target value: ";
    cin >> target;

    Solution solution;
    vector<int> result = solution.searchRange(nums, target);

    if (result[0] == -1 && result[1] == -1) {
        cout << "Target " << target << " not found in the array.\n";
    } else {
        cout << "The first occurrence of " << target << " is at index: " << result[0] << endl;
        cout << "The last occurrence of " << target << " is at index: " << result[1] << endl;
    }

    return 0;
}
