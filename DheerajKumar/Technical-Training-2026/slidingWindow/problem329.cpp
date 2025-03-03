/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length*/


#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        if(k == 0) return {};

        if(k == 1) return nums;

        int start = 0, end = 0;
        vector<int> outPutArray, preMax(nums.size(), 0), postMax(nums.size(), 0);

        preMax[0] = nums[0];
        for(int i = 1; i < nums.size(); i++){
            if(i % k == 0){
                preMax[i] = nums[i];
            }
            else {
                preMax[i] = max(preMax[i - 1], nums[i]);
            }
        }

        postMax[nums.size() - 1] = nums[nums.size() - 1];
        for (int i = nums.size() - 2; i >= 0; i--) {
            if((i + 1) % k == 0) {
                postMax[i] = nums[i];
            } else {
                postMax[i] = max(postMax[i + 1], nums[i]);
            }
        }

        while(start <= nums.size() - k){
            outPutArray.push_back(max(preMax[start + k - 1], postMax[start]));
            start++;
        }
        
        return outPutArray;
    }
};

int main(){
    Solution test;
    int windowSize = 3;
    vector<int> inputArray = {1,3,-1,-3,5,3,6,7}, outPut;

    outPut = test.maxSlidingWindow(inputArray, windowSize);
    cout<<"{ ";
    for(auto element : outPut){
        cout<<element<<", ";
    }
    cout<<"}";

    inputArray = {1}; windowSize = 1;
    cout<<"{ ";
    for(auto element : outPut){
        cout<<element<<", ";
    }
    cout<<"}";

    
}