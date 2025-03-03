/*Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.

 

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
 

Constraints:

1 <= nums.length <= 5 * 104
1 <= nums[i] <= 106
nums.length <= threshold <= 106*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
    bool convertTrueFalse(vector<int>& nums, int threshold, int result){
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += (nums[i] % result) == 0 ? (nums[i] / result) : (nums[i] / result) + 1;
        }
        return sum <= threshold ? true : false;
    }

public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start = 1, end = INT_MIN, mid = 0;

        for(int i = 0; i < nums.size(); i++){
            end = max(end, nums[i]);
        }

        while(start <= end){
            mid = start + (end - start) / 2;
            if(convertTrueFalse(nums, threshold, mid)){
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

    vector<int> input = {1,2,5,9}; int threshold = 6;
    cout<<"the minimum number to reach threshold is -> "<<test.smallestDivisor(input, threshold);
}