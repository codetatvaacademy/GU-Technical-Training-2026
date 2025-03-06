/*560. Subarray Sum Equals K
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107*/

#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
    public:
        int subarraySum(vector<int>& nums, int k) {
            
            unordered_map<int, int> prefixSum;
            prefixSum[0]++;
            int sum = 0, count = 0;
            
            for(int i = 0; i < nums.size(); i++){
                sum += nums[i];
                int remaning = sum - k;
                if(prefixSum.find(remaning) != prefixSum.end()){
                    count += prefixSum[remaning];
                }
                prefixSum[sum]++;
    
            }
            return count;
        }
    };


int main(){
    int testCases;
    cout<<"\nEnter number of test cases -> ";
    cin>>testCases;

    for(int i = 0; i < testCases; i++){
        vector<int> input;
        int size;
        cout<<"\n ENter the size -> ";
        cin>>size;

        for(int j = 0; j < size; j++){
            int userInput;
            cin>>userInput;
            input.push_back(userInput);
        }

        int k;
        cout<<"\n Enter the value to check sum of Sub set ->> ";
        cin>>k;

        Solution Test;
        cout<<"\nNumber of subsets ->> "<<Test.subarraySum(input, k);

    }
}