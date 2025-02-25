import java.util.Scanner;

class RichestCustomerWealth{
    public static int maximumWealth(int[][] accounts) {
        int customerWealth ;
        int max = 0;
        for (int[] account : accounts) {
            customerWealth = 0;
            for (int j = 0; j < account.length; j++) {
                customerWealth = customerWealth + account[j];
            }
            max = Math.max(customerWealth,max);
        }
        return max;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no of rows:");  
            int m = sc.nextInt();
            System.out.println("Enter the no of column:");  
            int n = sc.nextInt();
            int[][] accounts = new int[m][n];
            for (int i = 0; i < m; i++) {
                System.out.println("Enter the elements fo account: ");
                for (int j = 0; j < n; j++) {
                    accounts[i][j] = sc.nextInt();
                }
            }
            System.out.println("The wealth of the richest customer is: " + maximumWealth(accounts));
        }
    }
}  
