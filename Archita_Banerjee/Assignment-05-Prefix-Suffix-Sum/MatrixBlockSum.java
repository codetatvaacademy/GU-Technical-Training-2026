public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int cols = rows == 0 ? 0 : mat[0].length;
        int[][] answer = new int[rows][cols];

        for (int row = 1; row < rows; row++) {
            mat[row][0] += mat[row - 1][0];
        }

        for (int col = 1; col < cols; col++) {
            mat[0][col] += mat[0][col - 1];
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                mat[row][col] += mat[row - 1][col] + mat[row][col - 1] - mat[row - 1][col - 1];
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int r1 = Math.max (0, row - k);
                int c1 = Math.max (0, col - k);
                int r2 = Math.min (rows - 1, row + k);
                int c2 = Math.min (cols - 1, col + k);
                answer[row][col] = mat[r2][c2];
                answer[row][col] -= r1 == 0 ? 0 : mat[r1 - 1][c2];
                answer[row][col] -= c1 == 0 ? 0 : mat[r2][c1 - 1];
                answer[row][col] += r1 == 0 || c1 == 0 ? 0 : mat[r1 - 1][c1 - 1];
            }
        }

        return answer;

    }
}
