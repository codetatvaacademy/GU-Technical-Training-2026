#include <iostream>
#include <vector>

using namespace std;

// Function to count the number of subarrays with the given sum
int numSubarraysWithSum(vector<int>& nums, int goal) {
    int prefix_zeros = 0;
    int window_sum = 0;
    int count = 0;
    
    int i = 0, j = 0;
    
    while (j < nums.size()) {
        window_sum += nums[j];
        
        while (i < j && (nums[i] == 0 || window_sum > goal)) {
            if (nums[i] == 1) {
                prefix_zeros = 0;
            } else {
                prefix_zeros += 1;
            }
            
            window_sum -= nums[i];
            i++;
        }
        
        if (window_sum == goal) {
            count += 1 + prefix_zeros;
        }
        j++;
    }
    
    return count;
}

int main() {
    int n, goal;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements (only 0s and 1s): ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Enter the target sum (goal): ";
    cin >> goal;

    int result = numSubarraysWithSum(nums, goal);
    cout << "Number of subarrays with sum " << goal << ": " << result << endl;

    return 0;
}
