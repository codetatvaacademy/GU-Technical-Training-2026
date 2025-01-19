import java.util.Scanner;

public class RichestCustomer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=1; j<accounts[i].length; j++){
                accounts[i][j]+=accounts[i][j-1];
            }
            if(maxWealth<accounts[i][accounts[i].length-1]){
                maxWealth = accounts[i][accounts[i].length-1];
            }
        }
        return maxWealth;
    }
}