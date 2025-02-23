/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105*/
#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int start = 0, end = height.size() - 1, leftMax = 0, rightMax = 0, trappedWater = 0;

        while(start < end){

            if(height[start] < height[end]){
                leftMax = max(height[start], leftMax);

                if(height[start] < leftMax){
                    trappedWater += leftMax - height[start]; 
                }
                start++;
            }
            else{
                rightMax = max(height[end], rightMax);
                if(height[end] < rightMax){
                    trappedWater += rightMax - height[end]; 
                }
                end--;
            }

        }
        return trappedWater;
    }
};

int main(){
    Solution test;

    vector<int> input1 = {0,1,0,2,1,0,1,3,2,1,2,1};
    cout<<"the amount of water collected -> "<<test.trap(input1);

    input1 = {4,2,0,3,2,5};
    cout<<"the amount of water collected -> "<<test.trap(input1);
    
}