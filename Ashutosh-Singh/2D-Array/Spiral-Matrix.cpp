#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        int row = matrix.size();
        int col = matrix[0].size();
        
        int count = 0;
        int total = row * col;
        
        int startingCol = 0;
        int endingCol = col - 1;
        int startingRow = 0;
        int endingRow = row - 1;
        
        while(count < total){
            // Traverse starting row
            for(int index = startingCol; count < total && index <= endingCol; index++) {
                ans.push_back(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            
            // Traverse ending column
            for(int index = startingRow; count < total && index <= endingRow; index++) {
                ans.push_back(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            
            // Traverse ending row
            for(int index = endingCol; count < total && index >= startingCol; index--) {
                ans.push_back(matrix[endingRow][index]);
                count++;
            }
            endingRow--;
            
            // Traverse starting column
            for(int index = endingRow; count < total && index >= startingRow; index--) {
                ans.push_back(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return ans;
    }
};

int main() {
    Solution solution;
    
    int n, m;
    
    // Input matrix dimensions
    cout << "Enter number of rows (n): ";
    cin >> n;
    cout << "Enter number of columns (m): ";
    cin >> m;
    
    vector<vector<int>> matrix(n, vector<int>(m));
    
    // Input matrix elements
    cout << "Enter the elements of the matrix:" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> matrix[i][j];
        }
    }
    
    // Get the spiral order
    vector<int> result = solution.spiralOrder(matrix);

    // Output the result
    cout << "Spiral order: ";
    for (int val : result) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
