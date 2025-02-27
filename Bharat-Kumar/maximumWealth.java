import java.util.*;
class maximumWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] accounts = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }    
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
    
}
