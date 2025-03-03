#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        int n = mat.size();      
        int m = mat[0].size();    

        // If reshaping is not possible, return the original matrix
        if (n * m != r * c) {
            return mat; 
        }

        vector<vector<int>> ans(r, vector<int>(c));
        int row = 0, col = 0;

        // Reshaping the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if (col == c) { 
                    col = 0;
                    row++;
                }
            }
        }

        return ans;
    }
};

int main() {
    Solution solution;
    
    int n, m, r, c;
    
    // Input matrix dimensions
    cout << "Enter number of rows (n): ";
    cin >> n;
    cout << "Enter number of columns (m): ";
    cin >> m;
    
    vector<vector<int>> mat(n, vector<int>(m));
    
    // Input matrix elements
    cout << "Enter the elements of the matrix:" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> mat[i][j];
        }
    }
    
    // Input target dimensions for reshaping
    cout << "Enter number of rows (r) for reshaped matrix: ";
    cin >> r;
    cout << "Enter number of columns (c) for reshaped matrix: ";
    cin >> c;

    // Get reshaped matrix
    vector<vector<int>> result = solution.matrixReshape(mat, r, c);

    // Output the reshaped matrix
    cout << "Reshaped matrix: " << endl;
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
