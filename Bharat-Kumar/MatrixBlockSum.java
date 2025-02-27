import java.util.*;

public class MatrixBlockSum {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] prefix = new int[m + 1][n + 1];
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                prefix[i + 1][j + 1] = mat[i][j] + prefix[i + 1][j] + prefix[i][j + 1] - prefix[i][j];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k), c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k), c2 = Math.min(n - 1, j + k);
                result[i][j] = prefix[r2 + 1][c2 + 1] - prefix[r1][c2 + 1] - prefix[r2 + 1][c1] + prefix[r1][c1];
            }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int[][] result = matrixBlockSum(mat, k);
        for (int[] row : result) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
