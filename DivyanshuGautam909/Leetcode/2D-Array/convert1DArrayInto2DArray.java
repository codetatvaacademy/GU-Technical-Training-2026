import java.util.*;

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k = 0;
        int[][] arr = new int[m][n];
        if ((m * n) < original.length) {
            return new int[0][0];
        } else if ((m * n) > original.length) {
            return new int[0][0];
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = original[k];
                    k++;
                }
            }
            return arr;
        }
    }
}

public class convert1DArrayInto2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the 1D array: ");
        int size = scanner.nextInt();

        int[] original = new int[size];
        System.out.println("Enter the elements of the 1D array:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }

        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        Solution solution = new Solution();
        int[][] result = solution.construct2DArray(original, m, n);

        if (result.length == 0) {
            System.out.println("Cannot convert 1D array into 2D array with the given dimensions.");
        } else {
            System.out.println("Converted 2D Array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
