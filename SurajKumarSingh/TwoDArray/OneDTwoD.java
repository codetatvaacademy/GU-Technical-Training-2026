//LeetCode --> 2022

package TwoDArray;

import java.util.Scanner;

public class OneDTwoD {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n){
         return new int[0][0];
        }
 
         int [][] result = new int[m][n];
         int index = 0;
         for(int i = 0; i< m ; i++){
             for(int j = 0; j < n ; j++){
                  result[i][j] = original[index];
                  index++;
                }
            }
        return result; 
    }  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the original array: ");
        int size = scanner.nextInt();
        int[] original = new int[size];

        
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }

       System.out.print("Enter the number of rows (m) for the 2D array: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n) for the 2D array: ");
        int n = scanner.nextInt();

        OneDTwoD oneDTwoD = new OneDTwoD();

        int[][] result = oneDTwoD.construct2DArray(original, m, n);

        if (result.length == 0) {
            System.out.println("The dimensions do not match the size of the original array.");
        } else {
            System.out.println("The constructed 2D array is:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
