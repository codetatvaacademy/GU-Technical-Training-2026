//LeetCode --> 73

package TwoDArray;

import java.util.Scanner;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        boolean isRow0 = false;
        boolean iscol0 = false;

        for(int i = 0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
            isRow0 = true;
            }
        }
         for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
            iscol0 = true;
            }
        }
        for(int i = 1 ;i<matrix.length; i++){
            for(int j = 1; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(isRow0){
            for(int i = 0 ; i< matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
         if(iscol0){
            for(int i = 0 ; i< matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the number of rows in the matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix (row by row):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        SetMatrixZeros setMatrixZeros = new SetMatrixZeros();

        setMatrixZeros.setZeroes(matrix);

        System.out.println("The matrix after setting zeros is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close(); 
    }
}
