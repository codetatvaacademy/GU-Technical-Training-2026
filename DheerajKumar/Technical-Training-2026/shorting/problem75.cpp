/*
75. Sort Colors
Solved

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 

Follow up: Could you come up with a one-pass algorithm using only constant extra space?*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
    public:
        void sortColors(vector<int>& nums) {
            vector<int> counter(3, 0);
    
            for(int i = 0; i < nums.size(); i++){
                counter[nums[i]]++;
            }
            
            int helper = 0;
            for(int i = 0; i < counter.size(); i++){
                for(int j = 0; j < counter[i]; j++){
                    nums[helper++] = i;
                }
            }
        }
    };

int main(){
    int testCase;
    cout<<"\n\tEnter numebr of test cases ->> ";
    cin>>testCase;

    for(int i = 0; i < testCase; i++){
        vector<int> userInput;
        int size;
        cout<<"\n\tEnter the size of input -> ";
        cin>>size;

        cout<<"\n\tEnter number only 0 , 1 , 2 can be input ->> ";
        for(int j = 0; j < size; j++){
            int number;
            cin>>number;
            userInput.push_back(number);
        }

        Solution ClassTesting;
        ClassTesting.sortColors(userInput);

        cout<<"outPut - >> ";
        for(auto number : userInput){
            cout<<number<<", ";
        }
    }
}