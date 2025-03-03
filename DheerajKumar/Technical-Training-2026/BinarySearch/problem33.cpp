/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int sizeNums = nums.size(), 
        minimum = 0, maximum = sizeNums - 1, toFind = 0;

        while(minimum <= maximum){
            toFind = (minimum + maximum) / 2;

            if(nums[toFind] == target){
                return toFind;
            }

            if(nums[toFind] >= nums[minimum]){

                if(nums[minimum] <= target && nums[toFind] > target){
                    maximum = toFind - 1;
                }
                else{
                    minimum = toFind + 1;
                }
            }
            
            if(nums[toFind] <= nums[maximum]){

                if(nums[maximum] >= target && nums[toFind] < target){
                    minimum = toFind + 1;
                }
                else{
                    maximum = toFind - 1;
                }
            }
        }

        return - 1;
    }
};

int main(){
    Solution test;

    vector<int> input1 = {4,5,6,7,0,1,2}, input2 = {4,5,6,7,0,1,2}, input3 = {1};

    cout<<"\n\tfound at ->> "<<test.search(input1, 0);

    int returned = test.search(input2, 3);
    if(returned == -1){
        cout<<"\n\tElement not found !";
    }else{
        cout<<"\n\tfount at -> "<<returned;
    }

    returned = test.search(input2, 0);
    if(returned == -1){
        cout<<"\n\tElement not found !";
    }else{
        cout<<"\n\tfount at -> "<<returned;
    }

}