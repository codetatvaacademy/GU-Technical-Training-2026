#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

int minSubarray(vector<int>& nums, int p) {
    int n = nums.size();
    int SUM = 0;

    // Compute total sum modulo p
    for (int &num : nums) {
        SUM = (SUM + num) % p;
    }

    // Find the remainder that needs to be removed
    int target = SUM % p;
    if (target == 0) return 0; // If already divisible, no subarray needs removal

    unordered_map<int, int> mp; // Stores previous sum % p
    mp[0] = -1;

    int curr = 0, result = n;
    for (int j = 0; j < n; j++) {
        curr = (curr + nums[j]) % p;

        // Calculate the required remainder
        int remain = (curr - target + p) % p;

        // If this remainder was seen before, update the result
        if (mp.find(remain) != mp.end()) {
            result = min(result, j - mp[remain]);
        }

        // Store current prefix sum % p in the map
        mp[curr] = j;
    }

    return result == n ? -1 : result;
}

int main() {
    int n, p;
    cout << "Enter number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter the divisor p: ";
    cin >> p;

    int result = minSubarray(nums, p);
    cout << "Minimum subarray length to remove: " << result << endl;

    return 0;
}
