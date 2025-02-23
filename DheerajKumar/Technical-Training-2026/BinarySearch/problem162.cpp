/*162. Find Peak Element
Solved
Medium

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
    bool isValid(vector<int>& nums, int index){
        if(index < nums.size() - 1 && index > 0){
            if(nums[index] > nums[index - 1] && nums[index] > nums[index + 1]){
                return true;
            }
        } 
        if(index <= 0 && nums[index] > nums[index + 1]){
            return true;
        }
        if(index == nums.size() - 1 && nums[index] > nums[index - 1]){
            return true;
        }
        return false;
    }

public:
    int findPeakElement(vector<int>& nums) {
        int start = 0, end = nums.size() - 1, mid = 0;

        while(start < end){
            mid = start + (end - start) / 2;

            if(isValid(nums, mid)){
                return mid;
            }
            
            if(mid == 0 && isValid(nums, mid + 1)){
                return mid + 1;
            }

            if(mid == nums.size() - 1 && isValid(nums, mid - 1)){
                return mid - 1;
            }

            if(nums[mid - 1] > nums[mid + 1]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
};

int main(){
    Solution test;

    vector<int> input = {1,2,1,3,5,6,4};
    int index = test.findPeakElement(input);
    cout<<"\n\tThe preak Element is -> {"<<input[index]<<"} the index is -> "<<index;

    input = {1,2,3,4};
    index = test.findPeakElement(input);
    cout<<"\n\tThe preak Element is -> {"<<input[index]<<"} the index is -> "<<index;

    input = {1,2,3,1};
    index = test.findPeakElement(input);
    cout<<"\n\tThe preak Element is -> {"<<input[index]<<"} the index is -> "<<index;

    input = {1,2};
    index = test.findPeakElement(input);
    cout<<"\n\tThe preak Element is -> {"<<input[index]<<"} the index is -> "<<index;
}