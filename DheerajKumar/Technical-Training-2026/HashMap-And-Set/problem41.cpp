/*41. First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1*/

#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
    public:
        int firstMissingPositive(vector<int>& nums) {
            sort(nums.begin(), nums.end());
            int j = 1;
            for(int i = 0; i < nums.size(); i++){
                if(nums[i] == j) j++;
            }
            return j;
        }
    };

int main(){
    int testCases;
    cout<<"Test Cases ->> ";
    cin>>testCases;

    for(int i = 0; i < testCases; i++){
        vector<int> nums;
        int size;

        cout<<"enter size -> ";
        cin>>size;

        for(int j = 0; i < size; j++){
            int input;
            cin>>input;

            nums.push_back(input);
        }

        Solution Test;
        cout<<"The missing numebr is -> "<<Test.firstMissingPositive(nums);
    }
}