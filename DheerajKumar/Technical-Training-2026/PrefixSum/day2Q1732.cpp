/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 

Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int maxAltitude = 0, previousSum = 0;

        if(gain.size() == 1){
            return max(maxAltitude, gain[0]);
        }

        previousSum = gain[0];
        maxAltitude = max(maxAltitude ,previousSum); 
        
        for(int i = 1; i < gain.size(); i++){

            previousSum = previousSum + gain[i];
            maxAltitude = max(maxAltitude ,previousSum); 
        }
        return maxAltitude;
    }
};

int main(){
    Solution test1;

    vector<int> gain = {-5,1,5,0,-7}, gains2 = {-4,-3,-2,-1,4,3,2};

    cout<<"\n gains for first Road Trip -> "<<test1.largestAltitude(gain);
    cout<<"\n gains for second Road Trip -> "<<test1.largestAltitude(gains2);

    return 0;
}