#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        // Transpose the matrix
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }

        // Reverse each row
        for (int i = 0; i < matrix.size(); i++) {
            reverse(matrix[i].begin(), matrix[i].end());
        }
    }
};

int main() {
    Solution solution;

    int n;

    // Input size for the matrix
    cout << "Enter the size of the matrix (n x n): ";
    cin >> n;

    vector<vector<int>> matrix(n, vector<int>(n));

    // Input matrix elements
    cout << "Enter the elements of the matrix:" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> matrix[i][j];
        }
    }

    // Rotate the matrix
    solution.rotate(matrix);

    // Output the rotated matrix
    cout << "Matrix after 90 degree rotation: " << endl;
    for (const auto& row : matrix) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
