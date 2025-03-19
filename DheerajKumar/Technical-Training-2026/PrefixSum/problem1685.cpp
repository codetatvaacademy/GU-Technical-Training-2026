/*1685. Sum of Absolute Differences in a Sorted Array
You are given an integer array nums sorted in non-decreasing order.

Build and return an integer array result with the same length as nums such that result[i] is equal to the summation of absolute differences between nums[i] and all the other elements in the array.

In other words, result[i] is equal to sum(|nums[i]-nums[j]|) where 0 <= j < nums.length and j != i (0-indexed).

 

Example 1:

Input: nums = [2,3,5]
Output: [4,3,5]
Explanation: Assuming the arrays are 0-indexed, then
result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.
Example 2:

Input: nums = [1,4,6,8,10]
Output: [24,15,13,15,21]
 

Constraints:

2 <= nums.length <= 105
1 <= nums[i] <= nums[i + 1] <= 104*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
    public:
        std::vector<int> getSumAbsoluteDifferences(std::vector<int>& nums) {
            int size = nums.size();
            std::vector<int> prefixSum(size, 0);
            std::vector<int> result(size);
            
            prefixSum[0] = nums[0];
            for (int i = 1; i < size; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
    
            int totalSum = prefixSum[size - 1];
    
            for (int i = 0; i < size; i++) {
                int previousSum = (i > 0) ? std::abs(prefixSum[i - 1] - (nums[i] * i)) : 0;
                int postSum = std::abs(totalSum - prefixSum[i] - (nums[i] * (size - i - 1)));
                result[i] = previousSum + postSum;
            }
    
            return result;
        }
    };

int main(){
    vector<int> input = {1,4,6,8,10};
    Solution Test;

    vector<int> result = Test.getSumAbsoluteDifferences(input);
    for(auto numebrs : result){
        cout<<numebrs<<", ";
    }

}