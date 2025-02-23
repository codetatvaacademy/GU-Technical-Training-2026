/*Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104*/

#include<iostream>
#include<vector>
#include<algorithm>
#include<limits.h>

using namespace std;

class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int i = 0, j = i + 1, k = nums.size() - 1,
        difference = INT_MAX, currentDifference, sum = 0;

        sort(nums.begin(), nums.end());

        while(i < nums.size() - 2){
            j = i + 1; k = nums.size() - 1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                currentDifference = target - sum;

                difference = abs(difference) > abs(currentDifference) ? currentDifference : difference; 

                if(difference == 0){
                    return target;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        return target - difference;
    }
};

int main(){
    Solution test;

    vector<int> nums = {-1,2,1,-4};
    int target = 1;

    cout<<"the closest sum -> "<<test.threeSumClosest(nums, target);
}