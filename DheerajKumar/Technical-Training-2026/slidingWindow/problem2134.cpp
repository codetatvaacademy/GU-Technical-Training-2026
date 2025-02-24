/*
A swap is defined as taking two distinct positions in an array and swapping the values in them.

A circular array is defined as an array where we consider the first element and the last element to be adjacent.

Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.

 

Example 1:

Input: nums = [0,1,0,1,1,0,0]
Output: 1
Explanation: Here are a few of the ways to group all the 1's together:
[0,0,1,1,1,0,0] using 1 swap.
[0,1,1,1,0,0,0] using 1 swap.
[1,1,0,0,0,0,1] using 2 swaps (using the circular property of the array).
There is no way to group all 1's together with 0 swaps.
Thus, the minimum number of swaps required is 1.
Example 2:

Input: nums = [0,1,1,1,0,0,1,1,0]
Output: 2
Explanation: Here are a few of the ways to group all the 1's together:
[1,1,1,0,0,0,0,1,1] using 2 swaps (using the circular property of the array).
[1,1,1,1,1,0,0,0,0] using 2 swaps.
There is no way to group all 1's together with 0 or 1 swaps.
Thus, the minimum number of swaps required is 2.
Example 3:

Input: nums = [1,1,0,0,1]
Output: 0
Explanation: All the 1's are already grouped together due to the circular property of the array.
Thus, the minimum number of swaps required is 0.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int numberOfOnce = 0, start = 0, end = 0,
        sizeOfArray = nums.size();


        for(int i = 0; i < sizeOfArray; i++){
            numberOfOnce += nums[i] == 1 ? 1 : 0;
        }
        
        int minSwap = numberOfOnce, numberOfOnceWindow = 0;

        while(end < sizeOfArray + numberOfOnce){
            if(nums[end % sizeOfArray] == 1){
                numberOfOnceWindow++;
            }
            if((end - start + 1) > numberOfOnce){
                if(nums[start] == 1){
                    numberOfOnceWindow--;
                }
                start++;
            }

            if((end - start + 1) == numberOfOnce){
                minSwap = min(minSwap, (numberOfOnce - numberOfOnceWindow));
            }
            end++;
        }
        return minSwap;
    }
};

int main(){
    Solution test;

    vector<int> testInput = {0,1,1,1,0,0,1,1,0};
    cout<<"\n\tnumber of moves to shift all ones togather -> "<<test.minSwaps(testInput);

    testInput = {0,1,0,1,1,0,0}; 
    cout<<"\n\tnumber of moves to shift all ones togather -> "<<test.minSwaps(testInput);
    
    testInput = {1,1,0,0,1};
    cout<<"\n\tnumber of moves to shift all ones togather -> "<<test.minSwaps(testInput);
    
    return 0;
}