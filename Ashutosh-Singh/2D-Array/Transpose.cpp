#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<vector<int>> transpose(m, vector<int>(n)); // Create the transposed matrix

        // Perform the transposition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose; // Return the transposed matrix
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
    
    // Get the transposed matrix
    vector<vector<int>> result = solution.transpose(matrix);

    // Output the transposed matrix
    cout << "Transposed matrix: " << endl;
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
