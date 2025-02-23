import java.util.Scanner;

public class OddValueInMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; i++){
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(oddCells(n, m, grid));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[] arr:indices){
            int row = arr[0];
            int col = arr[1];
            for(int i=0; i<n; i++){
                matrix[row][i]++;
            }
            for(int i=0; i<m; i++){
                matrix[i][col]++;
            }
        }
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}