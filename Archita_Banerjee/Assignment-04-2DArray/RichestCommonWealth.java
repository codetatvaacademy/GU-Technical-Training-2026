import java.util.Scanner;
public class RichestCommonWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxW=0;
        for(int [] customer:accounts){
            int currW=0;
            for(int bank: customer){
                currW+=bank;
            }
            maxW= Math.max(maxW,currW);
        }
        return maxW;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of banks per customer: ");
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        System.out.println("Enter the wealth for each customer at each bank:");
        for (int i = 0; i < m; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int result = maximumWealth(accounts);
        System.out.println("The maximum wealth : " + result);

    }
}
