import java.util.Scanner;

public class CountNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        if(grid[grid.length-1][grid[0].length-1]>=0){
            return 0;
        }
        int count = 0;
        for(int i=grid.length-1; i>=0; i--){
            if(grid[i][grid[i].length-1]>=0){
                return count;
            }
            for(int j=grid[i].length-1; j>=0; j--){
                if(grid[i][j]>=0){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}