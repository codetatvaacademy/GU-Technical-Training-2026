import java.util.Scanner;

class NumMatrix {
    private int[][] prefixsum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        this.prefixsum = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixsum[i][j] = matrix[i - 1][j - 1]
                        + prefixsum[i - 1][j]
                        + prefixsum[i][j - 1]
                        - prefixsum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefixsum[row2 + 1][col2 + 1]
                - prefixsum[row1][col2 + 1]
                - prefixsum[row2 + 1][col1]
                + prefixsum[row1][col1];
    }
}

public class RangeSumQuery2DImmutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix dimensions (m n): ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        NumMatrix obj = new NumMatrix(matrix);

        System.out.print("Enter number of queries: ");
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter query (row1 col1 row2 col2): ");
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();
            System.out.println("Sum of region: " + obj.sumRegion(row1, col1, row2, col2));
        }

        scanner.close();
    }
}
