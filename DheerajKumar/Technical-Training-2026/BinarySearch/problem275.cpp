/*275. H-Index II
Solved

Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper and citations is sorted in ascending order, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

You must write an algorithm that runs in logarithmic time.

 

Example 1:

Input: citations = [0,1,3,5,6]
Output: 3
Explanation: [0,1,3,5,6] means the researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,2,100]
Output: 2
 

Constraints:

n == citations.length
1 <= n <= 105
0 <= citations[i] <= 1000
citations is sorted in ascending order.*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
    bool validHIndex(vector<int>& citations, int hIndex) {
        int size = citations.size();
        if (hIndex == 0) return true;
        return size - hIndex >= 0 && citations[size - hIndex] >= hIndex;
    }

public:
    int hIndex(vector<int>& citations) {
        int start = 0, end = citations.size(), mid;
        
        while (start <= end) {  
            mid = start + (end - start) / 2;
            
            if (validHIndex(citations, mid)) {
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return end;  
    }
};


int main(){
    int numberOfTest = 0;
    cout<<"Enetr the numebr of test case -> ";
    cin>>numberOfTest;

    for(int i = 0; i < numberOfTest; i++){
        int size;
        cout<<"Enter vector size -> ";
        cin>>size;
        vector<int> citations;
        cout<<"ENter array \n ->";
        for(int j = 0; j < size; j++){
            int entry;
            cin>>entry;
            citations.push_back(entry);
        }
        Solution ClassTesting;
        cout<<"The maximum hIndex -> "<<ClassTesting.hIndex(citations)<<"\n\t ";
    }
}

