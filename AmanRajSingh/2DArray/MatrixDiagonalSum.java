class Solution {
    public int diagonalSum(int[][] matrix) {
           int n = matrix.length;
           int sum = 0;

        for (int i = 0; i < n; i++) {
        
            sum += matrix[i][i];
            
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }
}