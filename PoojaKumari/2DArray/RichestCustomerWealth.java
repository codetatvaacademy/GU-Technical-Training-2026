import java.util.*;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int row = accounts.length - 1;
        int col = accounts[0].length - 1;
        for (int i = 0; i <= row; i++) {
            int sum = 0;
            for (int j = 0; j <= col; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter row length of matrix:");
        int row = sc.nextInt();
        System.out.print("Enter column length of matrix:");
        int col = sc.nextInt();
        int[][] accounts = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        result = maximumWealth(accounts);
        System.out.println(maximumWealth(accounts));
        sc.close();
    }
}