/*Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:

Input: nums = [1,2,3], k = 0
Output: 0
 

Constraints:

1 <= nums.length <= 3 * 104
1 <= nums[i] <= 1000
0 <= k <= 106*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        if(nums.size() <= 1){
            return nums[0] < k ? 1 : 0;
        }

        int start = 0, end = 0, numberOfSets = 0;
        long long multiplicationResult = 1;
        

        while(end < nums.size()){
            multiplicationResult *= nums[end];
            
            while(multiplicationResult >= k && start <= end){
                multiplicationResult /= nums[start];
                start++; 
            }
            numberOfSets += (end - start) + 1;
            end++;
        }
        return numberOfSets;
    }
};

int main(){
    Solution Test;

    vector<int> testInput = {1,1,1}; int thrusHold = 2;
    cout<<"\n\t The number of subsets ->> "<<Test.numSubarrayProductLessThanK(testInput, thrusHold);

    testInput = {10,5,2,6}; thrusHold = 100;
    cout<<"\n\t The number of subsets ->> "<<Test.numSubarrayProductLessThanK(testInput, thrusHold);

    testInput = {1}; thrusHold = 2;
    cout<<"\n\t The number of subsets ->> "<<Test.numSubarrayProductLessThanK(testInput, thrusHold);
}