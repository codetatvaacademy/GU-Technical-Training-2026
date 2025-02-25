import java.util.Scanner;

public class CountNegativeNumber {
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            int start = 0;
            int end = row.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (row[mid] < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            count += (row.length - start);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row length:");
        int row = sc.nextInt();
        System.out.print("Enter the column length:");
        int col = sc.nextInt();
        int[][] grid = new int[row][col];
        System.out.print("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        result=countNegatives(grid);
        System.out.print(result);
         sc.close();
    }
}
