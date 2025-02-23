import java.util.Scanner;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int r1 = mat.length;
        int c1 = mat[0].length;

        if (r1 * c1 != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];

        int r2 = 0;
        int c2 = 0;

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                reshaped[r2][c2] = mat[i][j];
                c2++; 
                if (c2 == c) { 
                    c2 = 0; 
                    r2++;  
                }
            }
        }
        return reshaped;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows in the original matrix: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter the number of columns in the original matrix: ");
        int c1 = scanner.nextInt();
        
        int[][] mat = new int[r1][c1];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter the number of rows for the reshaped matrix: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of columns for the reshaped matrix: ");
        int c = scanner.nextInt();
        
        Solution solution = new Solution();
        int[][] result = solution.matrixReshape(mat, r, c);
        
        System.out.println("Reshaped Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
