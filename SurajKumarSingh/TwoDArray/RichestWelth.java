//LeetCode --> 1672

package TwoDArray;

import java.util.Scanner;

public class RichestWelth {
    public int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<accounts.length;i++){
          int sum = 0;
          for(int j = 0; j < accounts[i].length; j++){
              sum += accounts[i][j];
            }
          maxi= Math.max(sum,maxi);
        }  
        return maxi;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        
        System.out.print("Enter the number of banks: ");
        int m = scanner.nextInt();


        int[][] accounts = new int[n][m];
        System.out.println("Enter the wealth of each customer in each bank (row by row):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        
        RichestWelth richestWealth = new RichestWelth();

    
        int result = richestWealth.maximumWealth(accounts);

        
        System.out.println("The maximum wealth is: " + result);

        scanner.close();
    }
}
