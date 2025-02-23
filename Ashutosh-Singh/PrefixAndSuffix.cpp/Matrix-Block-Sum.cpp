#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    void calculatePrefixSum(vector<vector<int>>& psum) {
        int n = psum.size();
        int m = psum[0].size();

        // Row-wise prefix sum
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                psum[i][j] += psum[i][j - 1];
            }
        }

        // Column-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                psum[j][i] += psum[j - 1][i];
            }
        }
    }

    int sumRegion(vector<vector<int>>& psum, int row1, int col1, int row2, int col2) {
        int ans = psum[row2][col2];
        if (row1 > 0) ans -= psum[row1 - 1][col2];
        if (col1 > 0) ans -= psum[row2][col1 - 1];
        if (row1 > 0 && col1 > 0) ans += psum[row1 - 1][col1 - 1];
        return ans;
    }

    vector<vector<int>> matrixBlockSum(vector<vector<int>>& mat, int k) {
        vector<vector<int>> psum = mat;
        calculatePrefixSum(psum);

        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat[0].size(); j++) {
                int r1 = max(0, i - k);
                int c1 = max(0, j - k);
                int r2 = min((int)mat.size() - 1, i + k);
                int c2 = min((int)mat[0].size() - 1, j + k);
                mat[i][j] = sumRegion(psum, r1, c1, r2, c2);
            }
        }
        return mat;
    }
};

int main() {
    Solution sol;

    int rows, cols, k;
    cout << "Enter number of rows: ";
    cin >> rows;
    cout << "Enter number of columns: ";
    cin >> cols;

    vector<vector<int>> mat(rows, vector<int>(cols));

    cout << "Enter the elements of the matrix:" << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> mat[i][j];
        }
    }

    cout << "Enter the value of k: ";
    cin >> k;

    // Calling the matrixBlockSum function
    vector<vector<int>> result = sol.matrixBlockSum(mat, k);

    // Output the result
    cout << "The resulting matrix is:" << endl;
    for (const auto& row : result) {
        for (const auto& val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
