/*
    ....304

Given a 2D matrix matrix, handle multiple queries of the following type:
Calculate the sum of the elements of matrix inside the rectangle defined by its upper left
corner (row1, col1) and lower right corner (row2, col2).
Implement the NumMatrix class:
NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of
matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right
corner (row2, col2).
You must design an algorithm where sumRegion works on O(1) time complexity.
Example 1:
Input
["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
[[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1,
1, 2, 2], [1, 2, 2, 4]]
Output
[null, 8, 11, 12]
Explanation
NumMatrix numMatrix = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4,
1, 0, 1, 7], [1, 0, 3, 0, 5]]);
numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
numMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
numMatrix.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)
Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 200
-10^4 <= matrix[i][j] <= 10^4
0 <= row1 <= row2 < m
0 <= col1 <= col2 < n
At most 10^4 calls will be made to sumRegion.*/

#include<iostream>
#include<vector>

using namespace std;

class NumMatrix {

    vector<vector<int>> prefixSum; //delaration of prefixSum
public:
    NumMatrix(vector<vector<int>>& matrix) {
        int rows = matrix.size(), columns = matrix[0].size();
        prefixSum = vector<vector<int>>(rows, vector<int>(columns, 0));  //initializing it with 0;

        prefixSum[0][0] = matrix[0][0];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == 0 && j == 0){
                    continue;
                }
                if(i == 0){
                    
                    prefixSum[0][j] = prefixSum[0][j - 1] + matrix[0][j];
                }else
                if(j == 0){
                    
                    prefixSum[i][j] = prefixSum[i - 1][j] + matrix[i][j];
                }else{

                    prefixSum[i][j] = ((prefixSum[i][j - 1] + prefixSum[i - 1][j]) + matrix[i][j]) - prefixSum[i - 1][j - 1];
                }
            }
        }


    }
    
    int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = prefixSum[row2][col2];

        if (row1 > 0) {
            ans -= prefixSum[row1 - 1][col2];
        }
        if (col1 > 0) {
            ans -= prefixSum[row2][col1 - 1];
        }
        if (row1 > 0 && col1 > 0) {
            ans += prefixSum[row1 - 1][col1 - 1];
        }

        return ans;
    }
};

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix* obj = new NumMatrix(matrix);
 * int param_1 = obj->sumRegion(row1,col1,row2,col2);
 */


int main(){
    vector<vector<int>> case1 = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}},
        boundries = {{2, 1, 4, 3}, {1, 1, 2, 2}, {1, 2, 2, 4}};

    NumMatrix *test = new NumMatrix(case1);

    vector<int> results;
    for(int i = 0; i < 3; i++){
        int outPut = test->sumRegion(boundries[i][0], boundries[i][1], boundries[i][2], boundries[i][3]);
        results.push_back(outPut);
    }

    cout<<"{ ";
    for(int i = 0; i < results.size(); i++){
        cout<<results[i]<<", ";
    }
    cout<<"}";
}