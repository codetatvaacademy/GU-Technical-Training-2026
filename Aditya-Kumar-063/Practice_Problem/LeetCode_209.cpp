#include <iostream>
#include <vector>
#include <climits> // for INT_MAX
#include <algorithm> // for min
using namespace std;

int minSubArrayLen(int target, vector<int>& nums) {
    int n = nums.size();
    int i = 0, j = 0;
    int minL = INT_MAX;
    int sum = 0;
    while (j < n) {
        sum += nums[j];
        while (sum >= target) {
            minL = min(minL, j - i + 1);
            sum -= nums[i];
            i++;
        }
        j++;
    }
    return minL == INT_MAX ? 0 : minL;
}

int main() {
    int target;
    int n;

    // Taking inputs from the user
    cout << "Enter the target sum: ";
    cin >> target;

    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    // Calling the function
    int result = minSubArrayLen(target, nums);

    // Output the result
    cout << "The minimum length of a subarray with sum >= target is: " << result << endl;

    return 0;
}
