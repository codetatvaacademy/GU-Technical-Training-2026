//165
class Solution {
public:
    int compareVersion(string version1, string version2) {
        int i = 0, j = 0;
        int len1 = version1.size(), len2 = version2.size();
        while (i < len1 || j < len2) {
            long revision1 = 0, revision2 = 0;
            while (i < len1 && version1[i] != '.') {
                revision1 = revision1 * 10 + (version1[i] - '0');
                i++;
            }
            while (j < len2 && version2[j] != '.') {
                revision2 = revision2 * 10 + (version2[j] - '0');
                j++;
            }
            if (revision1 < revision2) {
                return -1;
            } else if (revision1 > revision2) {
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
};

//1672
class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max = 0;
        for (const auto& row : accounts) {
            int add = 0;
            for (int num : row) {
                add += num;
            }
            if(add > max){
                max = add;
            }
        }
        return max;
    }
};

//1357
class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int count = 0;
        for (const auto& row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }
        return count;
    }
};

//1572
class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int n = mat.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        for (int i = 0; i < n; i++) {
            sum += mat[i][n - i - 1];
        }
        return sum;
    }
};

//2022
class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        if (original.size() != m * n) {
            return {};
        }
        vector<vector<int>> result(m, vector<int>(n));
        for (int i = 0; i < original.size(); ++i) {
            result[i / n][i % n] = original[i];
        }
        
        return result;
    }
};

//566
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if ((rows * columns) != (r * c)) {
            return mat;
        }

        int[][] result = new int[r][c];
        int i = 0, j = 0;

        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                result[i][j] = mat[k][l];
                j++;
                if (j >= c) {
                    j = 0;
                    i++;
                }
            }
        }

        return result;
    }
}

//867
class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<vector<int>> transpose(n, vector<int>(m, 0));
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
};

//54
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;
        vector<int> ans;
        while (top <= bottom && left <= right) {
            for(int i = top; i <= bottom; i++){
                ans.push_back(matrix[top][i]);
            }
            for(int i = left+1; i <= right; i++){
                ans.push_back(matrix[i][bottom]);
            }

            if (top <= bottom && left <= right) {
                for(int i = bottom - 1; i >= top; i--){
                    ans.push_back(matrix[i][right]);
                }
                for(int i = right - 1; i > left; i--){
                    ans.push_back(matrix[top][i]);
                }
            }
            left++, top++, right--, bottom--;
        }
        return ans;
    }
};

//59
class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;
        vector<vector<int>> ans(n, vector<int>(n, 0));
        
        int ad = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; ++i) {
                ans[r1][i] = ad++;
            }
            ++r1;
            for (int i = r1; i <= r2; ++i) {
                ans[i][c2] = ad++;
            }
            --c2;
            if (r1 <= r2) {
                for (int i = c2; i >= c1; --i) {
                    ans[r2][i] = ad++;
                }
                --r2;
            }

            if (c1 <= c2) {
                for (int i = r2; i >= r1; --i) {
                    ans[i][c1] = ad++;
                }
                ++c1;
            }
        }
        return ans;

    }
};

//48
class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(matrix[i].begin(), matrix[i].end());
        }
    }
};

//73
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstColumn = false;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstColumn = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstRow) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if (firstColumn) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}

//36
class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for (int i = 0; i < 9; i++) {
            set<char> rowSet;
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.find(board[i][j]) != rowSet.end()) {
                        return false;
                    }
                    rowSet.insert(board[i][j]);
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            set<char> colSet;
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (colSet.find(board[i][j]) != colSet.end()) {
                        return false;
                    }
                    colSet.insert(board[i][j]);
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                set<char> boxSet;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] != '.') {
                            if (boxSet.find(board[k][l]) != boxSet.end()) {
                                return false;
                            }
                            boxSet.insert(board[k][l]);
                        }
                    }
                }
            }
        }

        return true;
    }
};
