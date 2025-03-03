/*
34

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        if(nums.size() <= 0){
            return {-1, -1};
        }

        //#Finding the first Instance of Target !
        vector<int> outPut(2, 0);
        int minimum = 0, maximum = nums.size() - 1, middle = 0;
        
        while(minimum <= maximum){
            middle = minimum + (maximum - minimum) / 2;
            
            if(target <= nums[middle]){
                maximum = middle - 1;
            }
            else{
                minimum = middle + 1;
            }
        }

        if (minimum == nums.size() || nums[minimum] != target) {
            return {-1, -1};
        }
       
        outPut[0] = minimum;
        minimum = 0, maximum = nums.size() - 1, middle = 0;


        //#find the last instance !
        while(minimum <= maximum){
            middle = minimum + (maximum - minimum) / 2;
            
            if(target >= nums[middle]){
                minimum = middle + 1;
            }
            else{
                maximum = middle - 1;
            }
        }

        outPut[1] = maximum;
        return outPut;
    }
};

int main(){
    Solution test;

    vector<int> userInput = {5,7,7,8,8,10}, userInput2 = {};

    cout<<"\n [";
    for(auto outPut : test.searchRange(userInput, 8)){
        cout<<outPut<<", ";
    }
    cout<<"]";

    cout<<"\n [";
    for(auto outPut : test.searchRange(userInput, 6)){
        cout<<outPut<<", ";
    }
    cout<<"]";

    cout<<"\n [";
    for(auto outPut : test.searchRange(userInput2, 0)){
        cout<<outPut<<", ";
    }
    cout<<"]";
}

