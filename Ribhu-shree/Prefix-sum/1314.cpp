class Solution {
    public:
        vector<vector<int>> matrixBlockSum(vector<vector<int>>& mat, int k) {
            int m = mat.size();
            int n = mat[1].size();
             vector<vector<int>> answer(m,vector<int>(n,0));
            for(int i =0;i<mat.size();i++){
                for(int j =0;j<mat[1].size();j++){
                   for (int r = max(0, i - k); r <= min(m - 1, i + k); r++) {
                        for (int c = max(0, j - k); c <= min(n - 1, j + k); c++) {
                            answer[i][j] += mat[r][c];
                        }
                    }
                }
            }
            return answer;
        }
    };