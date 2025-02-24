/*Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

 

Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
Example 2:

Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
Example 3:

Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        if(nums.size() <= 1){
            return nums[0];
        }
        int start = 0, end = 1, sum = 0, TempSum = nums[0];

        while(end < nums.size()){
            if(nums[end] <= nums[end - 1]){
                sum = max(sum, TempSum);
                TempSum = nums[end];
            }
            else{
                TempSum += nums[end];
            }
            end++;
        }
        sum = max(sum, TempSum);
        return sum == 0 ? TempSum : sum;
    }
};

int main(){
    Solution test;
    
    vector<int> input = {5,5,6,6,6,9,1,2};
    cout<<"\n\tThe Maximum Ascending Sum => "<<test.maxAscendingSum(input);
    
    input = {10,30,30,5,10,50};
    cout<<"\n\tThe Maximum Ascending Sum => "<<test.maxAscendingSum(input);

}