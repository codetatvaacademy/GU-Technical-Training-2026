import java.util.Scanner;

public class DiagonalSum {

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

        System.out.println(diagonalSum(grid));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length-1;
        for(int i=0; i<mat.length; i++){
            sum+=mat[i][i];
            if(i!=len){
                sum+=mat[i][len];
            }
            len--;
        }
        return sum;
    }
}