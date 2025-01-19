//LeetCode --> 59

package TwoDArray;

import java.util.Scanner;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int r1 = 0;
        int c1 = 0;
        int r2 = n - 1;
        int c2 = n - 1;
  
        int [][] arr = new int[n][n];
        int val = 1;
  
        while(r1 <= r2 && c1 <= c2){
          for(int c = c1 ; c <= c2; c++){
              arr[r1][c] = val++;
            }
          if(r1 < r2 && c1 < c2){
          for(int r = r1 + 1; r<= r2; r++){
              arr[r][c2] = val++;
            }
          for(int c = c2 - 1; c >= c1; c--){
              arr[r2][c] = val++;
            }
          for(int r = r2 - 1; r > r1; r--){
              arr[r][c1] = val++;
            }
        }
        r1++;
        c1++;
        r2--;
        c2--;
        }
        return arr;  
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();

        int[][] result = spiralMatrixII.generateMatrix(n);

        System.out.println("The generated spiral matrix is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
