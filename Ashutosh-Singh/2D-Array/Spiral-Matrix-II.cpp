#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> matrix(n, vector<int>(n, 1));
       
        int count = 0;
        int total = n * n; 
        int value = 1;

        // Indexes for the boundaries of the matrix
        int left = 0; 
        int right = n - 1;
        int top = 0;
        int down = n - 1;

        while(count < total) {
            // Traverse the top row
            for (int i = left; count < total && i <= right; i++) {
                matrix[top][i] = value;
                count++;
                value++;
            }
            top++;

            // Traverse the right column
            for (int i = top; count < total && i <= down; i++) {
                matrix[i][right] = value;
                count++;
                value++;
            }
            right--;

            // Traverse the bottom row
            for (int i = right; count < total && i >= left; i--) {
                matrix[down][i] = value;
                count++;
                value++;
            }
            down--;

            // Traverse the left column
            for (int i = down; count < total && i >= top; i--) {
                matrix[i][left] = value;
                count++;
                value++;
            }
            left++;
        }
        return matrix;
    }
};

int main() {
    Solution solution;
    
    int n;
    
    // Input size for the matrix
    cout << "Enter the size of the matrix (n x n): ";
    cin >> n;
    
    // Get the matrix generated in spiral order
    vector<vector<int>> result = solution.generateMatrix(n);

    // Output the generated matrix
    cout << "Generated matrix in spiral order: " << endl;
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
