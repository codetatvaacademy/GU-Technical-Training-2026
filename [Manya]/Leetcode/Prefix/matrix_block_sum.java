import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefixSum = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = mat[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }
        
        int[][] result = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int r2 = Math.min(m - 1, i + k);
                int c1 = Math.max(0, j - k);
                int c2 = Math.min(n - 1, j + k);
                
                result[i][j] = prefixSum[r2 + 1][c2 + 1]
                             - prefixSum[r1][c2 + 1]
                             - prefixSum[r2 + 1][c1]
                             + prefixSum[r1][c1];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();
        
        int[][] mat = new int[m][n];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        
        Solution solution = new Solution();
        int[][] result = solution.matrixBlockSum(mat, k);
        
        System.out.println("Resultant matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        
        scanner.close();
    }
}
