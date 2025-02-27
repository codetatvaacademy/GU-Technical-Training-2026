/*
910. Smallest Range II

You are given an integer array nums and an integer k.

For each index i where 0 <= i < nums.length, change nums[i] to be either nums[i] + k or nums[i] - k.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after changing the values at each index.

 

Example 1:

Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
Example 2:

Input: nums = [0,10], k = 2
Output: 6
Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.
Example 3:

Input: nums = [1,3,6], k = 3
Output: 3
Explanation: Change nums to be [4, 6, 3]. The score is max(nums) - min(nums) = 6 - 3 = 3.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 104
0 <= k <= 104*/


#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
    public:
        int smallestRangeII(vector<int>& nums, int k) {
            sort(nums.begin(), nums.end());
            int n = nums.size();
            
            int minimum = nums[0];
            int maximum = nums[n - 1];
            int minimumScore = maximum - minimum;
    
            for (int i = 0; i < n - 1; ++i) {
                int new_min = min(minimum + k, nums[i + 1] - k);
                int new_max = max(maximum - k, nums[i] + k);
                minimumScore = min(minimumScore, new_max - new_min);
            }
    
            return minimumScore;
        }
    };

int main(){
    int numberOfInput;
    cout<<"\n\tEnter the numebr of inputs we have ?";
    cin>>numberOfInput;
    
    for(int i = 0; i < numberOfInput; i++){
        vector<int> array;
        int size;
        cout<<"\n\tENter the Vector Size ->> ";
        cin>>size;

        for(int j = 0; j < size; j++){
            int input;
            cin>>input;

            array.push_back(input);
        }
        
        int k;
        cout<<"\n\tEnter the value of k ->> ";
        cin>>k;

        Solution Test;
        cout<<"The Smallest Value after Operation ->> "<<Test.smallestRangeII(array, k);
    }
}