#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        if (original.size() != m * n) return {}; 

        vector<vector<int>> arr(m, vector<int>(n));
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index++];
            }
        }

        return arr;
    }
};

int main() {
    Solution sol;
    
    vector<int> original = {1, 2, 3, 4, 5, 6}; 
    int m = 2, n = 3;

    vector<vector<int>> result = sol.construct2DArray(original, m, n);

    if (result.empty()) {
        cout << "Cannot convert to 2D array" << endl;
    } else {
        for (const auto& row : result) {
            for (int num : row) {
                cout << num << " ";
            }
            cout << endl;
        }
    }

    return 0;
}
