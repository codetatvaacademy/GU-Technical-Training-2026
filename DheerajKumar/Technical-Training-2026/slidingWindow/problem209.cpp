/*
209

Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n))
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int start = 0, end = 0, sum = 0, minimumLength = nums.size() + 1;

        while(end < nums.size()){
            sum += nums[end];
            end++;
            
            
            while(sum >= target){
                minimumLength = min(minimumLength, end - start);
                sum -= nums[start];
                start++;

            }
            
        }
        return (minimumLength == nums.size() + 1) ? 0 : minimumLength;
    }
};

int main(){
    Solution test;

    vector<int> array = {2,3,1,2,4,3}, array2 = {1,1,1,1,1,1,1,1};

    cout<<"\n\tminimum lenght the target can b e reached -> "<<test.minSubArrayLen(7 , array);
    cout<<"\n\tminimum lenght the target can b e reached -> "<<test.minSubArrayLen(11 , array2);

}