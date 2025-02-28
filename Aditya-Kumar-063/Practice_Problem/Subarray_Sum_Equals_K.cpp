#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

// Function to count the number of subarrays with sum equal to k
int subarraySum(vector<int>& nums, int k) {
    int count = 0;
    unordered_map<int, int> presum; // To store prefix sum frequencies
    int sum = 0; // Running sum (prefix sum)
    
    // Iterate over the array
    for (int num : nums) {
        sum += num; // Update the running sum
        
        // If running sum itself is equal to k, increment count
        if (sum == k) 
            count++;
        
        // Check if there exists a prefix sum that results in sum - k
        if (presum.find(sum - k) != presum.end()) 
            count += presum[sum - k];
        
        // Increment the frequency of the current running sum in the map
        presum[sum]++;
    }
    
    return count;
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

    cout << "Enter the target sum (k): ";
    cin >> k;

    int result = subarraySum(nums, k);
    cout << "Number of subarrays with sum " << k << ": " << result << endl;

    return 0;
}
