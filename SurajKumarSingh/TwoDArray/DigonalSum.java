//LeetCode --> 1572

package TwoDArray;

import java.util.Scanner;

public class DigonalSum {
    public int diagonalSum(int[][] mat) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = mat.length;
    
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += mat[i][i];
        }
    
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += mat[i][n - i - 1];
        }
        
        if (n % 2 != 0) {
            secondaryDiagonalSum -= mat[n / 2][n / 2];
        }
    
        return primaryDiagonalSum + secondaryDiagonalSum;
    
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter the elements of the matrix (row by row):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        DiagonalSum diagonalSum = new DiagonalSum();

        int result = diagonalSum.diagonalSum(mat);

        System.out.println("The sum of the diagonals is: " + result);

        scanner.close(); 
    }
}
