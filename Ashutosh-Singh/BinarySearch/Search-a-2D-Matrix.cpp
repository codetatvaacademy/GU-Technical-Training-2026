#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size();
        int col = matrix[0].size();
        
        int s = 0;
        int e = (row * col) - 1;
        
        int mid = s + (e - s) / 2;
        while (s <= e) {
            int element = matrix[mid / col][mid % col];
            
            if (element == target) {
                return true;
            } else if (element < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return false;
    }
};

int main() {
    int rows, cols, target;

    cout << "Enter the number of rows in the matrix: ";
    cin >> rows;

    cout << "Enter the number of columns in the matrix: ";
    cin >> cols;

    vector<vector<int>> matrix(rows, vector<int>(cols));
    cout << "Enter the elements of the matrix in row-major order:\n";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix[i][j];
        }
    }

    cout << "Enter the target value to search for: ";
    cin >> target;

    Solution solution;
    bool found = solution.searchMatrix(matrix, target);

    if (found) {
        cout << "Target value " << target << " is found in the matrix.\n";
    } else {
        cout << "Target value " << target << " is not found in the matrix.\n";
    }

    return 0;
}
