#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
#include <climits>
using namespace std;

class Solution {
public:
    int sum(vector<int> nums, int mid) {
        int sum = 0;
        for (auto x : nums) {
            sum += ceil((double)x / (double)mid);
        }
        return sum;
    }

    int smallestDivisor(vector<int>& nums, int threshold) {
        int n = nums.size();
        if (n > threshold) return -1;
        int start = 1;
        int end = INT_MIN;
        for (auto x : nums) {
            end = max(x, end);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (sum(nums, mid) <= threshold) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
};

int main() {
    Solution solution;
    int n, threshold;

    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter the threshold: ";
    cin >> threshold;

    int result = solution.smallestDivisor(nums, threshold);
    if (result == -1) {
        cout << "It is not possible to find a divisor within the given threshold." << endl;
    } else {
        cout << "The smallest divisor is: " << result << endl;
    }

    return 0;
}
