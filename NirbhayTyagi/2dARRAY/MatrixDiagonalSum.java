import java.util.Scanner;

class MatrixDiagonalSum{
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != j) {
                sum += mat[i][j];
            }
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");  
        int m = sc.nextInt();
        System.out.println("Enter the no of column:");  
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the element of account: ");
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The nsum of the diagonals of the matrix is: " + diagonalSum(mat));
    }
}