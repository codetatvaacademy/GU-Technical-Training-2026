/*
There is a circle of red and blue tiles. You are given an array of integers colors. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
Every 3 contiguous tiles in the circle with alternating colors (the middle tile has a different color from its left and right tiles) is called an alternating group.

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.


Example 1:

Input: colors = [1,1,1]

Output: 0

Example 2:

Input: colors = [0,1,0,0,1]

Output: 3

Constraints:

3 <= colors.length <= 100
0 <= colors[i] <= 1

*/
 
#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors) {

        int end = 0, totalAlternating = 0, noOfTiles = colors.size();
        if(noOfTiles <= 1){
            return 0;
        }
        
        while(end < noOfTiles ){

            if(colors[((end - 1) + noOfTiles) % noOfTiles] != colors[end] &&
            colors[end] != colors[(end + 1) % noOfTiles]){

                totalAlternating++;
            }
            end++;
        }

        return totalAlternating; 
    }
};


int main(){
    Solution test;

    vector<int> tiles = {1, 0, 1};
    cout<<"a\n\tthe valid no of altrenating is ->>"<< test.numberOfAlternatingGroups(tiles);

    tiles = {0, 1, 0, 0, 1};
    cout<<"\n\tthe valid no of altrenating is ->>"<< test.numberOfAlternatingGroups(tiles);
    
}
