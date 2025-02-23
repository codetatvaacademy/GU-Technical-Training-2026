//LeetCode --> 867 

package TwoDArray;

import java.util.Scanner;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
         int n = matrix[0].length;
         int[][] transpose = new int[n][m]; 
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 transpose[j][i] = matrix[i][j]; 
                }
            }
        return transpose;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the original matrix: ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns in the original matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the original matrix (row by row):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        TransposeMatrix transposeMatrix = new TransposeMatrix();

        int[][] result = transposeMatrix.transpose(matrix);

        System.out.println("The transposed matrix is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
