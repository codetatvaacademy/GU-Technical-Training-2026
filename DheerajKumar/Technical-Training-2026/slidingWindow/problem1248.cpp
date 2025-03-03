/*
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

 

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.
Example 3:

Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
 

Constraints:

1 <= nums.length <= 50000
1 <= nums[i] <= 10^5
1 <= k <= nums.length
*/
#include<iostream>
#include<vector>

using namespace std;

class Solution {
    int numberOfTotalSets(vector<int>& nums, int k){
        int start = 0, end = 0, noOfOdds = 0, noOfSets = 0;

        while (end < nums.size()) {
            if (nums[end] % 2 != 0) {
                noOfOdds++;
            }
            while (noOfOdds > k) {
                if (nums[start] % 2 != 0) {
                    noOfOdds--;
                }
                start++;
            }

            noOfSets += (end - start + 1);
            end++;
        }
        return noOfSets;
    }

public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        
        return numberOfTotalSets(nums, k) - numberOfTotalSets(nums, k-1);
    }
};


int main(){
    Solution test;

    vector<int> array = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
    int maxOdd = 2;

    cout<<"\n\tThe number of possible sets -> "<<test.numberOfSubarrays(array, maxOdd);

    array = {1, 1, 2, 1, 1}; maxOdd = 3;
    cout<<"\n\tThe number of possible sets -> "<<test.numberOfSubarrays(array, maxOdd);

    array = {2, 4, 6}; maxOdd = 1;
    cout<<"\n\tThe number of possible sets -> "<<test.numberOfSubarrays(array, maxOdd);

}

