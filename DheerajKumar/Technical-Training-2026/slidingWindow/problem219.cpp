/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105*/

#include<iostream>
#include<vector>
#include<unordered_set>
using namespace std;

class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        if (k == 0) return false;
        unordered_set<int> window;
        
        for (int i = 0; i < nums.size(); ++i) {
            if (window.find(nums[i]) != window.end()) {
                return true;
            }
            window.insert(nums[i]);
            
            if (window.size() > k) {
                window.erase(nums[i - k]);
            }
        }
        
        return false;
    }
};

int main(){
    Solution test;

    vector<int> testCase1 = {1,2,3,1}; int windowSize = 3;
    if(test.containsNearbyDuplicate(testCase1, windowSize)){
        cout<<"\n \tValid !";
    }
    else{
        cout<<"\n \tInValid !";
    }

    testCase1 = {1,0,1,1}; windowSize = 1;
    if(test.containsNearbyDuplicate(testCase1, windowSize)){
        cout<<"\n \tValid !";
    }
    else{
        cout<<"\n \tInValid !";
    }

    testCase1 = {1,2,3,1,2,3}; windowSize = 2;
    if(test.containsNearbyDuplicate(testCase1, windowSize)){
        cout<<"\n \tValid !";
    }
    else{
        cout<<"\n \tInValid !";
    }
}