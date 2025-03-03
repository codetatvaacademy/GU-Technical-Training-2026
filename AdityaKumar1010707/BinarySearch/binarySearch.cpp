#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int start = 0;
        int end = nums.size() - 1;  
        return BinarySearch(nums, start, end, target);
    }

    int BinarySearch(vector<int>& arr, int start, int end, int target) {
        if (start > end) return -1;  

        int mid = start + (end - start) / 2; 

        if (arr[mid] == target) return mid;

        if (arr[mid] > target) 
            return BinarySearch(arr, start, mid - 1, target);
        else 
            return BinarySearch(arr, mid + 1, end, target);
    }
};

int main() {
    int n, target;
    cout << "Enter number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter sorted array elements: ";
    for (int i = 0; i < n; i++) cin >> nums[i];

    cout << "Enter target value: ";
    cin >> target;

    Solution sol;
    int result = sol.search(nums, target);

    if (result != -1)
        cout << "Target found at index: " << result << endl;
    else
        cout << "Target not found in the array." << endl;

    return 0;
}
