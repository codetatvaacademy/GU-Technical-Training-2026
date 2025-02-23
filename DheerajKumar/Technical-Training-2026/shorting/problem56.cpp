/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104*/

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        if(intervals.size() <= 1){
            return intervals;
        }

        sort(intervals.begin(), intervals.end(), [](vector<int>& a, vector<int>& b) {return a[0] < b[0];});

        vector<vector<int>> output;
        int start = 0, end = 1, minimum = intervals[0][0], maximum = intervals[0][1];

        
        while(end < intervals.size()){
            if(intervals[end][0] <= maximum){
                maximum = max(maximum, intervals[end][1]);
                end++;
            }
            else{
                output.push_back({minimum, maximum});
                start = end;
                minimum = intervals[start][0];
                maximum = intervals[start][1];
                end++;
            }
        }
        output.push_back({minimum, maximum});
        return output;
    }
};

int main(){
    Solution test;

    vector<vector<int>> input = {{1,3},{2,6},{8,10},{15,18}}, output;
    output = test.merge(input);

    cout<<"\n the mearged array is ->> ";
    for(auto x : output){
        for(auto y : x){
            cout<<y<<", ";
        }
        cout<<"\n";
    }

    input = {{1,4},{4,5},{3,10}};
    output = test.merge(input);

    cout<<"\n the mearged array is ->> ";
    for(auto x : output){
        for(auto y : x){
            cout<<y<<", ";
        }
        cout<<"\n";
    }    
}