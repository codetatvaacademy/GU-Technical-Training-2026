import java.util.Scanner;

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the original array: ");
        int size = scanner.nextInt();
        int[] original = new int[size];
        
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int[][] result = solution.construct2DArray(original, m, n);
        
        if (result.length == 0) {
            System.out.println("Cannot construct a valid 2D array with the given dimensions.");
        } else {
            System.out.println("Constructed 2D Array:");
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