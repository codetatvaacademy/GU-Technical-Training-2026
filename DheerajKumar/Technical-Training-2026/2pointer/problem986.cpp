/*You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi] and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.

The intersection of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].

 

Example 1:


Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
Example 2:

Input: firstList = [[1,3],[5,9]], secondList = []
Output: []
 

Constraints:

0 <= firstList.length, secondList.length <= 1000
firstList.length + secondList.length >= 1
0 <= starti < endi <= 109
endi < starti+1
0 <= startj < endj <= 109 
endj < startj+1*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& firstList, vector<vector<int>>& secondList) {
        int pointerFirstList = 0, pointerSecondList = 0,
        firstListSize = firstList.size(), secondListSize = secondList.size();

        if(firstListSize == 0 || secondListSize == 0){
            return {};
        }

        vector<vector<int>> interSection;
        vector<int> intersect(2, 0);


        while(pointerFirstList < firstListSize && pointerSecondList < secondListSize){
            intersect = {0, 0};
            
            if(pointerFirstList < firstListSize && pointerSecondList < secondListSize){

                if(firstList[pointerFirstList][0] > secondList[pointerSecondList][1]){
                    pointerSecondList++;
                    continue;
                }

                if( firstList[pointerFirstList][1] < secondList[pointerSecondList][0]){
                    pointerFirstList++;
                    continue;
                }
                
                intersect[0] = max(firstList[pointerFirstList][0], secondList[pointerSecondList][0]);
                intersect[1] = min(firstList[pointerFirstList][1], secondList[pointerSecondList][1]);

                interSection.push_back(intersect);

            }

            if(firstList[pointerFirstList][1] < secondList[pointerSecondList][1]){
                pointerFirstList++;                
            }
            else{
                pointerSecondList++;

            }
        }            

        return interSection;
    }
};

int main(){
    Solution test;

    vector<vector<int>> input1 = {{0,2},{5,10},{13,23},{24,25}}, input2 = {{1,5},{8,12},{15,24},{25,26}}, outPut;
    outPut = test.intervalIntersection(input1, input2);

    cout<<"output interaction input 1 ->> \n";
    for(auto row : outPut){
        for(auto element : row){
            cout<<element<<", ";
        }
        cout<<"\n";
    }

    input1 = {{1,3},{5,9}}; input2 = {};
    outPut = test.intervalIntersection(input1, input2);

    cout<<"output interaction input 2 ->>";
    for(auto row : outPut){
        for(auto element : row){
            cout<<element<<", ";
        }
        cout<<"\n";
    }
}