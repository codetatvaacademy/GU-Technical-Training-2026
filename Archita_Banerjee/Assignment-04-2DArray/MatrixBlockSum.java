
import java.util.Scanner;
public class MatrixBlockSum {
    public static int diagonalSum(int[][] mat) {
        int n= mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2==1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix values:");
        for (int i = 0; i < n; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int result = diagonalSum(mat);
        System.out.println("The diagonal sum of the matrix is: " + result);

    }
}
