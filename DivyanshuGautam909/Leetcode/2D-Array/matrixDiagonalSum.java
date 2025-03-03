import java.util.*;

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            if (i == n - 1 - i) {
                sum += mat[i][i];
            } else {
                sum += mat[i][i] + mat[i][n - 1 - i];
            }
        }
        return sum;
    }
}

public class matrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        int result = solution.diagonalSum(mat);

        System.out.println("Diagonal Sum: " + result);

        scanner.close();
    }
}
