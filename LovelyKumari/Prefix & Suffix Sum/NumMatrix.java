package LovelyKumari.PrefixAndSuffixSum;
class NumMatrix { //
    // Time complexity : O(row*col + q (queries)) and Space complexity-> O(row*col) because of matSum array
    private int[][] matSum;
    private int rows, cols;

    public NumMatrix(int[][] matrix) {
        rows = matrix.length;
        cols = matrix[0].length;
        matSum = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= cols; ++j) {
                matSum[i][j] = matSum[i - 1][j] + matSum[i][j - 1] - matSum[i - 1][j - 1] + matrix[i - 1][j - 1]; //ensures that each element is computed as the sum of all elements above it, to its left, and the current cell, minus the double-counted region
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matSum[row2 + 1][col2 + 1] - matSum[row1][col2 + 1] - matSum[row2 + 1][col1] + matSum[row1][col1]; // subtracts the areas that are outside the desired region and adds back the area that was subtracted twice
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1, col1, row2, col2);
 */
