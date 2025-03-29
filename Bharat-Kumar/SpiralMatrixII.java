import java.util.*;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;
            
            for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;
            
            for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
            bottom--;
            
            for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] result = generateMatrix(n);

        for (int[] row : result) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
