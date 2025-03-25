/*1588. Sum of All Odd Length Subarrays
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
Example 3:

Input: arr = [10,11,12]
Output: 66
 

Constraints:

1 <= arr.length <= 100
1 <= arr[i] <= 1000
 

Follow up:

Could you solve this problem in O(n) time complexity?*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
    public:
        int sumOddLengthSubarrays(vector<int>& arr) {
            int sum = 0;
            vector<int> number(arr.size(), 0);
            number[0] = arr[0];
    
            for(int i = 1; i < arr.size(); i++){
                number[i] = number[i - 1] + arr[i];
            }
    
            for(int start  = 0; start < arr.size(); start++){
                for(int end = start; end < arr.size(); end += 2){
                    sum += number[end] - (start > 0 ? number[start - 1] : 0);
                }
            }
            return sum;
        }
    };

int main(){
    vector<int> arr = {1,2,3,4,5,6,7};
    Solution Test;
    cout<<Test.sumOddLengthSubarrays(arr);
}