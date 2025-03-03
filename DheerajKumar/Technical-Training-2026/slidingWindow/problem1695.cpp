/*
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

 

Example 1:

Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].
Example 2:

Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 104*/


#include<iostream>
#include<vector>
#include<limits.h>

using namespace std;

class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int maximum = INT_MIN;
        for(int i = 0; i < nums.size(); i++){
            maximum = max(nums[i], maximum);
        }

        vector<int> mapper(maximum + 1, 0);
        int end = 0, start = 0, sum = 0, maxSum = 0;

        while(end < nums.size()){
            while(mapper[nums[end]] > 0){
                sum -= nums[start];
                mapper[nums[start]]--;
                start++;
            }
            mapper[nums[end]]++;
            sum += nums[end];

            maxSum = max(maxSum, sum);
            
            end++;
        }

        return maxSum;
    }
};


int main(){

    Solution test;
    vector<int> array = {4,2,4,5,6};

    cout<<"\n\tmaximum sum is ->> "<<test.maximumUniqueSubarray(array);

    array = {5,2,1,2,5,2,1,2,5};
    cout<<"\n\tmaximum sum is ->> "<<test.maximumUniqueSubarray(array);
}