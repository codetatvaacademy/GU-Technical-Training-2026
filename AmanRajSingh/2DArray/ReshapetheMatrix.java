class Solution {
    public int[][] matrixReshape(int[][] mat, int m, int n) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        if (rows * cols != m * n) {
            return mat;
        }

        int[][] result = new int[m][n];
        
       
        int row = 0, col = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == n) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return result;
    }
}
