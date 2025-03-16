// 304. Range Sum Query 2D - Immutable.

// Given a 2D matrix matrix, handle multiple queries of the following type:
// Calculate the sum of the elements of matrix inside the rectangle defined by 
// its upper left corner (row1, col1) and lower right corner (row2, col2).
// Implement the NumMatrix class:
// NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
// int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the 
// elements of matrix inside the rectangle defined by its upper left corner (row1, col1) 
// and lower right corner (row2, col2).
// You must design an algorithm where sumRegion works on O(1) time complexity.


#include <iostream>
#include <vector>
using namespace std;

class NumMatrix {
public:
    int row; 
    int col;
    vector<vector<int>>ans; // Prefix sum matrix

    NumMatrix(vector<vector<int>> &matrix){
        row=matrix.size();
        col=row > 0 ? matrix[0].size() : 0;
        ans=vector<vector<int>>(row+1, vector<int>(col+1, 0)); // 1-based indexing

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                int up = ans[i - 1][j];  // Value from the above row
                int left = ans[i][j - 1]; // Value from the left column
                int diag = ans[i - 1][j - 1]; // Diagonal value (top-left)
                ans[i][j] = matrix[i - 1][j - 1] + up + left - diag;
            }
        }
    }

    int sumRegion(int row1, int col1, int row2, int col2) {
        // Convert 0-based indexing to 1-based indexing
        int total = ans[row2 + 1][col2 + 1];
        int up = ans[row1][col2 + 1]; // Value above the region
        int left = ans[row2 + 1][col1]; // Value left of the region
        int diag = ans[row1][col1]; // Top-left overlap region
        return total - up - left + diag;
    }
};

int main() {
    vector<vector<int>> matrix={
        {3, 0, 1, 4, 2},
        {5, 6, 3, 2, 1},
        {1, 2, 0, 1, 5},
        {4, 1, 0, 1, 7},
        {1, 0, 3, 0, 5}
    };

    NumMatrix numMatrix(matrix);
    cout<<"Sum of region (2, 1, 4, 3): "<<numMatrix.sumRegion(2, 1, 4, 3); // Expected: 8
    
}
