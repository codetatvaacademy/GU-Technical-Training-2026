import java.util.*;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (r * c != m * n) {
            return mat; // If reshape is not possible, return original matrix
        }

        int[][] reshape = new int[r][c];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshape[index / c][index % c] = mat[i][j];
                index++;
            }
        }
        return reshape;
    }
}

public class reshapeTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows in the original matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns in the original matrix: ");
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter number of rows for reshaped matrix: ");
        int r = scanner.nextInt();
        System.out.print("Enter number of columns for reshaped matrix: ");
        int c = scanner.nextInt();

        Solution solution = new Solution();
        int[][] result = solution.matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
