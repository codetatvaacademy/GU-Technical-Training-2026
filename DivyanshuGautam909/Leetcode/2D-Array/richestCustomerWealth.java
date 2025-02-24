import java.util.Scanner;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

public class richestCustomerWealth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int m = scanner.nextInt();

        System.out.print("Enter number of banks: ");
        int n = scanner.nextInt();

        int[][] accounts = new int[m][n];

        System.out.println("Enter account balances:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        int result = solution.maximumWealth(accounts);

        System.out.println("Maximum Wealth: " + result);

        scanner.close();
    }
}
