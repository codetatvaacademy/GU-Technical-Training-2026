//LeetCode --> 1351

package TwoDArray;

import java.util.Scanner;

public class CountNegativeNumber {
    public int countNegatives(int[][] grid) {
        int count  = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j <grid[i].length; j++){
                if(grid[i][j] < 0 ){
                  count++;
                }
            }
        }
     return count;  
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the grid: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the grid: ");
        int cols = scanner.nextInt();

        int[][] grid = new int[rows][cols];
        System.out.println("Enter the elements of the grid (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        CountNegativeNumber countNegativeNumber = new CountNegativeNumber();

        int result = countNegativeNumber.countNegatives(grid);

        System.out.println("The number of negative numbers in the grid is: " + result);

        scanner.close();
    }
}
