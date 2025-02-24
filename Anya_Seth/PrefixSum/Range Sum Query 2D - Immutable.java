class NumMatrix {
int[][] sums;
    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        sums = new int[matrix.length][matrix[0].length];
        sums[0][0] = matrix[0][0];
        for (int j = 1; j < matrix[0].length; j ++) {
            sums[0][j] = sums[0][j - 1] + matrix[0][j];
        }
        for (int i = 1; i < matrix.length; i ++) {
            sums[i][0] = sums[i-1][0] + matrix[i][0];
        }
        for (int i = 1; i < matrix.length; i ++) {
            for (int j = 1;j < matrix[0].length; j ++) {
                sums[i][j] = sums[i-1][j] + sums[i][j-1] + matrix[i][j] - sums[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2][col2] - (col1 == 0?0:sums[row2][col1 - 1]) - (row1 == 0?0:sums[row1 - 1][col2]) + (row1 != 0 && col1 != 0?sums[row1 - 1][col1 - 1]:0);
    }
}
