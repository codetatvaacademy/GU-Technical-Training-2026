//LeetCode --> 1314

package prefixsum;

import java.util.Scanner;

public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
          int n = mat.length;
          int m = mat[0].length;

            int[][] ans = new int[n][m];
            prefixsum(ans, n, m, mat);

            int[][] answer = new int[n][m];
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                  int r1 = Math.max(0, i - k);
                  int c1 = Math.max(0, j - k);
                  int r2 = Math.min(n - 1, i + k);
                  int c2 = Math.min(m - 1, j + k);
                  answer[i][j] = blocksum(ans, r1, c1, r2, c2);
                }
            }
        return answer;
    }

    public int blocksum(int[][] ans, int row1, int col1, int row2, int col2) {
          if(row1 == 0 && col1 != 0){
             return ans[row2][col2] - ans[row2][col1 - 1];
            }
         else if(row1 != 0 && col1 == 0){
                 return ans[row2][col2] - ans[row1 - 1][col2];
            }
         else if(row1 == 0 && col1 == 0){
              return ans[row2][col2];
            }
         else {
             return ans[row2][col2] - ans[row2][col1 - 1] - ans[row1 - 1][col2] + ans[row1 -1][col1 - 1];
            }
    }

    public void prefixsum(int[][] ans, int n, int m, int[][] mat) {
        ans[0][0] = mat[0][0];
          for (int i = 1; i < n; i++) {
               ans[i][0] = ans[i - 1][0] + mat[i][0];
            }
          for (int j = 1; j < m; j++) {
                ans[0][j] = ans[0][j - 1] + mat[0][j];
            }
          for (int i = 1; i < n; i++) {
             for (int j = 1; j < m; j++) {
                  ans[i][j] = mat[i][j] + ans[i - 1][j] + ans[i][j - 1] - ans[i - 1][j - 1];
                }
            }
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of rows in the matrix: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int m = scanner.nextInt();

    
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        
        MatrixBlockSum matrixBlockSum = new MatrixBlockSum();

        
        int[][] result = matrixBlockSum.matrixBlockSum(mat, k);

        
        System.out.println("The resulting matrix after block sum is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
