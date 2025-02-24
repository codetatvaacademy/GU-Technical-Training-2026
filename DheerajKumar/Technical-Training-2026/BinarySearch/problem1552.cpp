/*In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.

Rick stated that magnetic force between two different balls at positions x and y is |x - y|.

Given the integer array position and the integer m. Return the required force.

 

Example 1:


Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
Example 2:

Input: position = [5,4,3,2,1,1000000000], m = 2
Output: 999999999
Explanation: We can use baskets 1 and 1000000000.
 

Constraints:

n == position.length
2 <= n <= 105
1 <= position[i] <= 109
All integers in position are distinct.
2 <= m <= position.length*/

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
    bool checkValidity(vector<int>& position, int balls, int mid){
        balls -= 1;
        int selectPosition = 0;
        for(int i = 1; i < position.size(); i++){
            if(position[i] - position[selectPosition] > mid){
                balls--;
                selectPosition = i;
            }
            if(balls == 0){
                return true;
            }
        } 

        return false;
    }

public:
    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(), position.end());

        int minimum = 1, maximum = position[position.size() - 1] - 1, middle = 0;

        while(minimum <= maximum){
            middle = (minimum + maximum) / 2;

            if(checkValidity(position, m, middle)){
                minimum = middle + 1;
            }
            else{
                maximum = middle - 1;
            }
        }

        return maximum + 1;
    }
};

int main(){
    Solution test;
    vector<int> positions1 = {1,2,3,4,7}, positions2 = {5,4,3,2,1,1000000000}, positions3 = {2,8,7,3,10,12,17};

    cout<<"The magnatic force = "<< test.maxDistance(positions1, 3);
    cout<<"The magnatic force = "<< test.maxDistance(positions2, 2);
    cout<<"The magnatic force = "<< test.maxDistance(positions3, 4);

}