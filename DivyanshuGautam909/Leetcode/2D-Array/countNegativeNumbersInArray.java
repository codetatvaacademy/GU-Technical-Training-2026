import java.util.*;

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class countNegativeNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        int result = solution.countNegatives(grid);

        System.out.println("Count of Negative Numbers: " + result);

        scanner.close();
    }
}
