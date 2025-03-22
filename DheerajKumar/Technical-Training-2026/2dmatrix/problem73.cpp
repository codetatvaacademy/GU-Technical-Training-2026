/*73. Set Matrix Zeroes
Attempted
Medium
Topics
Companies
Hint
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1*/

#include <iostream>
#include <vector>

using namespace std;

class SolutionBruteForct {
    public:
        void setZeroes(vector<vector<int>>& matrix) {
            for(int i = 0; i < matrix.size(); i++){
                for(int j = 0; j < matrix[0].size(); j++){
                    
                    if(matrix[i][j] == 0){
                        for(int k = 0; k < matrix.size(); k++){
                            if(matrix[k][j] != 0) matrix[k][j] = -2004;         //trying and hitting with random values to clear test case test case. 
                        }
                        for(int m = 0; m < matrix[0].size(); m++){
                            if(matrix[i][m] != 0) matrix[i][m] = -2004;
                        }
                    }
                }
            }
    
            for(int i = 0; i < matrix.size(); i++){
                for(int j = 0; j < matrix[0].size(); j++){
                    if(matrix[i][j] == -2004) matrix[i][j] = 0;
                }
            }
        }
    };


    class Solution {
        public:
            void setZeroes(vector<vector<int>>& matrix) {
                int rows = matrix.size(), columns = matrix[0].size();
        
                vector <bool> rowMarker (rows, false), columnMarker(columns, false); 
                for(int i = 0; i < rows; i++){
                    for(int j = 0; j < columns; j++){
                        if(matrix[i][j] == 0){
                            rowMarker[i] = true;
                            columnMarker[j] = true;
                        }
                    }
                }
        
                for(int i = 0; i < rowMarker.size(); i++){
                    if(rowMarker[i] == true){
                        for(int j = 0; j < columns; j++){
                            matrix[i][j] = 0;
                        }
                    }
                }
        
                for(int i = 0; i < columnMarker.size(); i++){
                    if(columnMarker[i] == true){
                        for(int j = 0; j < rows; j++){
                            matrix[j][i] = 0;
                        }
                    }
                }
            }
        };

int main(){
    vector<vector<int>> matrix = {{1,1,1},{1,0,1},{1,1,1}};
    Solution Test;
    Test.setZeroes(matrix);

    for(auto rows: matrix){
        for(auto columns : rows){
            cout<<columns<<", ";
        }
        cout<<"\n";
    }
    return 0;
}