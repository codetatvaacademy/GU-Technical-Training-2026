import java.util.Scanner;

class NumMatrix {
    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefixSum[i][j] = matrix[i][j] + (i > 0 ? prefixSum[i - 1][j] : 0) + (j > 0 ? prefixSum[i][j - 1] : 0) - (i > 0 && j > 0 ? prefixSum[i - 1][j - 1] : 0);
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefixSum[row2][col2] - (row1 > 0 ? prefixSum[row1 - 1][col2] : 0) - (col1 > 0 ? prefixSum[row2][col1 - 1] : 0) + (row1 > 0 && col1 > 0 ? prefixSum[row1 - 1][col1 - 1] : 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        NumMatrix numMatrix = new NumMatrix(matrix);

        System.out.print("Enter the number of queries: ");
        int queries = scanner.nextInt();

        for (int q = 0; q < queries; q++) {
            System.out.println("Enter row1, col1, row2, col2 for query " + (q + 1) + ":");
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();

            System.out.println("Sum of the specified region: " + numMatrix.sumRegion(row1, col1, row2, col2));
        }

        scanner.close();
    }
}
//Time Complexity: O(n*m + q)
//Space Complexity: O(n*m)
