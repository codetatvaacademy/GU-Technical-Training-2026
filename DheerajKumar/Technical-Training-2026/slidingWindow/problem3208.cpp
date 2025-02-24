/*
There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.

 

Example 1:

Input: colors = [0,1,0,1,0], k = 3

Output: 3

Explanation:



Alternating groups:



Example 2:

Input: colors = [0,1,0,0,1,0,1], k = 6

Output: 2

Explanation:



Alternating groups:



Example 3:

Input: colors = [1,1,0,1], k = 4

Output: 0

Explanation:



 

Constraints:

3 <= colors.length <= 105
0 <= colors[i] <= 1
3 <= k <= colors.length*/

#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors, int k) {
        int noOfTiles = colors.size();

        if (noOfTiles < k) {
            return 0;
        }

        int counter = 1, validSum = 0;

        for (int i = 1; i < noOfTiles; ++i) {
            if (colors[i] != colors[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter >= k) {
                validSum++;
            }
        }

        int circularCounter = counter;
        int circularValidSum = validSum;

        for (int i = 0; i < noOfTiles; ++i) {
            if (colors[i] != colors[(i - 1 + noOfTiles) % noOfTiles]) {
                circularCounter++;
            } else {
                circularCounter = 1; 
            }
            if (circularCounter >= k) {
                circularValidSum++;
            }
        }

        return circularValidSum - validSum;
    }
};


int main(){
    Solution test;

    vector<int> testCase1 = {0,1,0,1,0};
    int k = 3;

    cout<<"\n the no of pairs ->> "<<test.numberOfAlternatingGroups(testCase1, k);

    testCase1 = {0,1,0,0,1,0,1}; k = 6;
    cout<<"\n the no of pairs ->> "<<test.numberOfAlternatingGroups(testCase1, k);

    testCase1 = {1, 1, 0, 1}; k = 4;
    cout<<"\n the no of pairs ->> "<<test.numberOfAlternatingGroups(testCase1, k);

}