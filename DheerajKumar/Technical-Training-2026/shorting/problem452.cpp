/*452. Minimum Number of Arrows to Burst Balloons
Solved
There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

 

Example 1:

Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
Example 2:

Input: points = [[1,2],[3,4],[5,6],[7,8]]
Output: 4
Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
Example 3:

Input: points = [[1,2],[2,3],[3,4],[4,5]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
- Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
 

Constraints:

1 <= points.length <= 105
points[i].length == 2
-231 <= xstart < xend <= 231 - 1*/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
    public:
        int findMinArrowShots(vector<vector<int>>& points) {
            
            sort(points.begin(), points.end(), [](vector<int> &A, vector<int> &B){
                return A[1] < B[1];
            });
    
            int numberOfArrows = 1, endOfBallon = points[0][1];
    
            for(int ittrate = 1; ittrate < points.size(); ittrate++){
                int newEnd = points[ittrate][0];
    
                if(newEnd <= endOfBallon){
                    continue;
                }
                else{
                    numberOfArrows++;
                    endOfBallon = points[ittrate][1];
                }
            }
    
            for(auto x : points){
                for(auto y : x){
                    cout<<y<<", ";
                }
                cout<<"\n"; 
            }
            return numberOfArrows;
        }
    };


int main(){
    int testcase;
    cout<<"Enter the  number of test Cases - >> ";
    cin>>testcase;

    for(int i = 0; i < testcase; i++){
        vector<vector<int>> input;
        int start, end;
        int numebrOfBallon;

        cout<<"enter the numebr of Ballons ->> ";
        cin>>numebrOfBallon;

        for(int j = 0; j < numebrOfBallon; j++){
            cin>>start;
            cin>>end;
            input.push_back({start, end});
        }

        Solution Test; 
        cout<<"Minimum Arrows required ! ->> "<<Test.findMinArrowShots(input);
    }
}