//LeetCode --> 48

package TwoDArray;

import java.util.Scanner;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
             for (int j = i + 1; j < matrix[i].length; j++) {
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
                }
            }

         for(int  i = 0 ; i < m; i++){
             reverse(matrix[i]);
            }
    }

     public static void reverse(int [] matrix){
          int i = 0;
          int j = matrix.length - 1;
            while(i <= j){
                int temp = matrix[i];
                matrix[i] = matrix[j];
                matrix[j] = temp; 
                i++;
                j--;
            }
        } 
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix (row by row):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        RotateImage rotateImage = new RotateImage();

        rotateImage.rotate(matrix);

        System.out.println("The rotated matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close(); 
    }
}
