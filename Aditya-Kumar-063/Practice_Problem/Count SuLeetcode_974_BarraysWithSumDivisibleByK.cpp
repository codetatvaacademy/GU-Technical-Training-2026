#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

// Function to count subarrays whose sum is divisible by k
int subarraysDivByK(vector<int>& nums, int k) {
    int n = nums.size();
    unordered_map<int, int> mp; // Stores remainder frequencies
    int sum = 0, result = 0;

    // Initial remainder count (for sum = 0)
    mp[0] = 1;

    for (int i = 0; i < n; i++) {
        sum += nums[i]; // Update prefix sum
        int rem = sum % k; // Compute remainder

        // Handle negative remainders to keep them positive
        if (rem < 0) {
            rem += k;
        }

        // If remainder already exists in the map, add its frequency to result
        if (mp.find(rem) != mp.end()) {
            result += mp[rem];
        }

        // Store/update remainder frequency in the map
        mp[rem]++;
    }

    return result;
}

int main() {
    int n, k;
    cout << "Enter number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter value of k: ";
    cin >> k;

    int result = subarraysDivByK(nums, k);
    cout << "Number of subarrays whose sum is divisible by " << k << ": " << result << endl;

    return 0;
}
