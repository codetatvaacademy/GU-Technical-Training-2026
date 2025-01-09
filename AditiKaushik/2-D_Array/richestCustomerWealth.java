// 1672. Richest Customer Wealth

import java.util.Scanner;

class richestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                wealth += accounts[i][j];
            }
            max = Math.max(wealth, max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of banks: ");
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter the amount of money in bank " + (j + 1) + " of customer " + (i + 1) + ": ");
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println("The maximum wealth is: " + maximumWealth(accounts));
        sc.close();
    }
}

//Time Complexity: O(m*n)
//Space Complexity: O(1)