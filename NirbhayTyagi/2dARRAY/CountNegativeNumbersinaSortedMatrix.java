import java.util.Scanner;

class CountNegativeNumbersinaSortedMatrix{
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] row : grid) {
            int left = 0, right = grid[0].length;
            while (left < right) {
                int mid = (left + right) / 2;
                if (row[mid] < 0) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            ans += grid[0].length - left;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");  
        int m = sc.nextInt();
        System.out.println("Enter the no of column:");  
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the element of account: ");
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("The negative numbers in the grid is: " + countNegatives(grid));
    }
}