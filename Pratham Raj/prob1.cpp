#include <iostream>
#include <vector>
using namespace std;

// int main() {
//     int arr[] = {2, 3, -1, 8, 4};
//     int n = sizeof(arr) / sizeof(arr[0]);
    
//     vector<int> pref(n, 0);
//     vector<int> suff(n, 0);
    
//     pref[0] = arr[0];
//     for (int i = 1; i < n; i++) {
//         pref[i] = pref[i - 1] + arr[i];
//     }
//     suff[n - 1] = arr[n - 1];
//     for (int i = n - 2; i >= 0; i--) {
//         suff[i] = suff[i + 1] + arr[i];
//     }
//     int totalSum = 0;


//     for (int i = 0; i < n; i++) {
//         cout << pref[i] << " ";
//     }
//     cout << endl;
//     for (int i = 0; i < n; i++) {
//         cout << suff[i] << " ";
//     }
//     cout << endl;
    

//     return 0;
// }

int midInd(vector<int>& nums) {
    int totalSum = 0, leftSum = 0;
    for (int i=0;i<nums.size();i++) {
        totalSum += nums[i];
    }
    // cout<<totalSum;
    for (int i = 0; i < nums.size(); i++) {
        int rightSum = totalSum - leftSum - nums[i];
        if (leftSum == rightSum) {
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
}

int main() {
    vector<int> nums = {2, 3, -1, 8, 4};  
//     int result = midInd(nums);
//     cout << result << endl;
//     return 0;
// }
