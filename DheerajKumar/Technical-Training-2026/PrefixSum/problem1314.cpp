/*1314. Matrix Block Sum

Given a m x n matrix mat and an integer k, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for:

i - k <= r <= i + k,
j - k <= c <= j + k, and
(r, c) is a valid position in the matrix.
 

Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]
Example 2:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n, k <= 100
1 <= mat[i][j] <= 100*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
    public:
        vector<vector<int>> matrixBlockSum(vector<vector<int>>& mat, int k) {
            vector<vector<int>> prefixSum (mat.size(), vector<int>(mat[0].size(), 0));
    
            for(int i = 0; i < mat.size(); i++){
                for(int j = 0; j < mat[0].size(); j++){
                    int digonal = (i == 0 || j == 0) ? 0 :  prefixSum[i - 1][j - 1],
                    left = (j == 0) ? 0 : prefixSum[i][j - 1],
                    top = (i == 0) ? 0 : prefixSum[i - 1][j];
    
                    prefixSum[i][j] = (left + top + mat[i][j]) - digonal;
                }
            }
    
            for(auto row : mat){
                for(auto column : row){
                    cout<<column <<", ";
                }
                cout<<"|\n|";
            }
    
            cout<<"\n\n";
    
            cout<<"|";
            for(auto row : prefixSum){
                for(auto column : row){
                    cout<<column <<", ";
                }
                cout<<"|\n|";
            }
    
            return {{}};
        }
    };

int main(){

}