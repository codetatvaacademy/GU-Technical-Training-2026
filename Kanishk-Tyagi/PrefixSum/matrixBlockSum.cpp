class Solution {
public:
    vector<vector<int>> matrixBlockSum(vector<vector<int>>& mat, int k) {
        int n = mat.size();
        int m = mat[0].size();

        vector<vector<int>> prefix(n + 1, vector<int>(m + 1, 0));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prefix[i + 1][j + 1] = mat[i][j] 
                                     + prefix[i][j + 1] 
                                     + prefix[i + 1][j] 
                                     - prefix[i][j];
            }
        }

        vector<vector<int>> result(n, vector<int>(m, 0));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tr = max(0, i - k);
                int br = min(n - 1, i + k);
                int lc = max(0, j - k);
                int rc = min(m - 1, j + k);

                tr++;
                br++;
                lc++;
                rc++;

                result[i][j] = prefix[br][rc]
                             - prefix[tr - 1][rc]
                             - prefix[br][lc - 1]
                             + prefix[tr - 1][lc - 1];
            }
        }

        return result;
    }
};
