import java.util.*;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Mark rows and columns that should be zero
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }

        // Set zeroes
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (row[i] || col[j])
                    matrix[i][j] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
