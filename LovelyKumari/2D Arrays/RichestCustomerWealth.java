import java.util.Scanner;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth= Integer.MIN_VALUE;
        for(int[] customer : accounts){
            int wealth=0;
            for(int account : customer){
                wealth += account ;
            }
            maxWealth= Math.max(maxWealth , wealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of customer: ");
        int m=sc.nextInt();
        System.out.println("Enter no. of banks: ");
        int n=sc.nextInt();

        int[][] accounts=new int[m][n];
        System.out.println("Enter account balances: ");
        for(int i=0; i<m; i++){
            System.out.println("Customer "+(i+1)+ ": ");
            for(int j=0; j<n; j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        RichestCustomerWealth obj=new RichestCustomerWealth();
        int answer=obj.maximumWealth(accounts);
        System.out.println("Output: "+answer);
    } 
}
