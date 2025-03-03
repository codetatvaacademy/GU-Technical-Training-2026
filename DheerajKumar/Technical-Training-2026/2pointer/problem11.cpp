/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int start = 0, end = height.size() - 1, area = INT_MIN, length = 0, breath = 0;

        for(int i = 0; i < height.size(); i++){
            length = end - start;
            breath = min(height[start], height[end]);
            
            height[start] < height[end] ? start++ : end--;
            area = max(area, length * breath);
        }
        return area;
    }
};

int main(){
    Solution test;

    vector<int> bounderies = {1,8,6,2,5,4,8,3,7};
    cout<<"\n  the maximum water can be ->> "<<test.maxArea(bounderies);
}