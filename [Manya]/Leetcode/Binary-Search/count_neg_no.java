import java.util.Scanner;

class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (grid[row][col] < 0) {
                count += rows - row;
                col--;
            } else {
                row++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();
        
        int[][] grid = new int[m][n];
        
        System.out.println("Enter the elements of the grid:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        Solution solution = new Solution();
        int result = solution.countNegatives(grid);
        
        System.out.println("Number of negative numbers: " + result);
        
        scanner.close();
    }
}
