import java.util.Scanner;

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean Frow = false;
        boolean Fcol = false;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int c = 0; c < cols; c++) {
            if (matrix[0][c] == 0) {
                Frow = true;
                break;
            }
        }

        for (int r = 0; r < rows; r++) {
            if (matrix[r][0] == 0) {
                Fcol = true;
                break;
            }
        }

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (Frow) {
            for (int c = 0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }

        if (Fcol) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
