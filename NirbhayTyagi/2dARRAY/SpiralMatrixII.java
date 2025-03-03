import java.util.Arrays;
import java.util.Scanner;

class SpiralMatrixII{
    public static int[][] generateMatrix(int n) {
        int r1 = 0;
        int c1 = 0;
        int r2 = n - 1;
        int c2 = n - 1;
        int[][] matrix = new int[n][n];
        int num = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                matrix[r1][c] = num;
                num++;
            }
            for (int r = r1 + 1; r <= r2; r++) {
                matrix[r][c2] = num;
                num++;
            }

            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c >= c1; c--) {
                    matrix[r2][c] = num;
                    num++;
                }
                for (int r = r2 - 1; r > r1; r--) {
                    matrix[r][c1] = num;
                    num++;
                }
            }

            r1++;
            c1++;
            r2--;
            c2--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[][] matrix = generateMatrix(n);
        System.out.println("The matrix is: ");
        for (int[] row : matrix) {
            System.out.print(Arrays.toString(row));
        }
    }
}

//time complexity of the function is : O(n^2)
//space complexity of the function is : O(n^2)

//time complexity of the whole program is : O(n^2)
//space complexity of the whole program is : O(n^2)