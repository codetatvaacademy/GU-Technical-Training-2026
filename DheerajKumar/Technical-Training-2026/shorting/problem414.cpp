/*414. Third Maximum Number
Solved

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1*/

#include <iostream>
#include <vector>
#include <limits.h>

using namespace std;

class Solution {
    public:
        int thirdMax(vector<int>& nums) {
             long long firstLargest = LONG_MIN, secondLargest = LONG_MIN, thirdLargest = LONG_MIN;
    
            for (int num : nums) {
                if (num == firstLargest || num == secondLargest || num == thirdLargest) 
                    continue;
    
                if (num > firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = firstLargest;
                    firstLargest = num;
                } else if (num > secondLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = num;
                } else if (num > thirdLargest) {
                    thirdLargest = num;
                }
            }
    
            return (thirdLargest == LONG_MIN) ? firstLargest : thirdLargest;
        }
    };
    

int main(){
    int testCases;
    cout<<"Enter the number of test case -> ";
    cin>>testCases;

    for(int i = 0; i < testCases; i++){
        vector<int> input;
        int size;
        cout<<"Enter the size of array -> ";
        cin>>size;
        for(int j = 0; j < size; j++){
            int number;
            cin>>number;
            input.push_back(number);
        }
        Solution Test;
        cout<<"Third max numebr is ->> "<<Test.thirdMax(input);
    }
}