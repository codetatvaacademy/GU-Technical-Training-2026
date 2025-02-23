/*Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100*/

#include<iostream>
#include<vector>
#include<limits.h>

using namespace std;

class Solution {
public:
    bool check(vector<int>& nums) {
        int count = 1;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i % nums.size()] <= nums[(i + 1) % nums.size()]){
                continue;
            }
            else{
                if(count >= 1){
                    count--;
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
};

int main(){
    Solution Test;
    
    vector<int> testInput = {2,7,4,1,2,6,2};
    if(Test.check(testInput)){
        cout<<"\n\tthe array is sorted!";
    }
    else{
        cout<<"\n\tArray is not sorted !";
    }

    testInput = {2,4,1,3};
    if(Test.check(testInput)){
        cout<<"\n\tthe array is sorted!";
    }
    else{
        cout<<"\n\tArray is not sorted !";
    }

}