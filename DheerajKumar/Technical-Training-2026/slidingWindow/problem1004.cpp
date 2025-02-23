/*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int start = 0, end = 0, maximumLength = 0;

        while(end < nums.size()){
            if(nums[end] == 1){
                maximumLength = max(maximumLength, end - start + 1);
                end++;
                continue;
            }

            while(k <= 0){
                if(nums[start] == 0){
                    k++;
                }
                start++;
            }

            if(nums[end] == 0 && k > 0){
                k--;
            }
            maximumLength = max(maximumLength, end - start + 1);
            end++;
        }
        return maximumLength;
    }
};


int main(){
    Solution test;
    
    vector<int> inputNums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}; int k = 3;
    cout<<"\n\n\tThe maximum achievable length with crosponding input is ->> "<<test.longestOnes(inputNums, k);

    inputNums = {1,1,1,0,0,0,1,1,1,1,0}; k = 2;
    cout<<"\n\tThe maximum achievable length with crosponding input is ->> "<<test.longestOnes(inputNums, k);
}