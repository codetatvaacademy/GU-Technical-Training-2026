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
        // indexes
        int left = 0;
        int right = n - 1;
        int top = 0;
        int down = n - 1;

        while (count < total) {
            // firstRow
            for (int i = left; count < total && i <= right; i++) {
                matrix[top][i] = value;
                count++;
                value++;
            }
            top++;

            // endColumn
            for (int i = top; count < total && i <= down; i++) {
                matrix[i][right] = value;
                count++;
                value++;
            }
            right--;

            // lastRow
            for (int i = right; count < total && i >= left; i--) {
                matrix[down][i] = value;
                count++;
                value++;
            }
            down--;

            // firstCol
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
    int n;
    cout << "Enter the size of the matrix (n): ";
    cin >> n;

    Solution solution;
    vector<vector<int>> result = solution.generateMatrix(n);

    cout << "The generated matrix is:" << endl;
    for (const auto& row : result) {
        for (int num : row) {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}
