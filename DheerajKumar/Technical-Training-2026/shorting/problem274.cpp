/*Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

 

Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,3,1]
Output: 1
 

Constraints:

n == citations.length
1 <= n <= 5000
0 <= citations[i] <= 1000*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int hIndex(vector<int>& citations) {
        if(citations.size() <= 1){
            if(citations[0] != 0){
                return 1;
            }
            return 0;
        }
        vector<int> mapper(citations.size() + 1, 0);

        for(int i = 0; i < citations.size(); i++){
            if(citations[i] < citations.size() + 1){
                mapper[citations[i]] ++;
            }
            else{
                mapper[citations.size()]++;
            }
        }

        for(int i = citations.size() - 1; i >= 0; i--){
            mapper[i] += mapper[i + 1];
        }

        for(int i = 0; i < citations.size() + 1; i++){
            if(mapper[i] < i){
                return i - 1;
            }
        }
        return citations.size();
    }
};

int main(){
    Solution test;

    vector<int> input = {3,0,6,1,5};
    cout<<"the citations valid until ->> "<<test.hIndex(input);
}