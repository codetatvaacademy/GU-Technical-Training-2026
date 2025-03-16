import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isFirstRow = false;
        boolean isFirstCol = false;

        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                isFirstRow = true;
                break;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                isFirstCol = true;
                break;
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] != 0) {
                    if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                        matrix[row][col] = 0;
                    }
                }
            }
        }

        if (isFirstRow) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[0][col] = 0;
            }
        }

        if (isFirstCol) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}

public class setMatrixZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        solution.setZeroes(matrix);

        System.out.println("Modified Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
