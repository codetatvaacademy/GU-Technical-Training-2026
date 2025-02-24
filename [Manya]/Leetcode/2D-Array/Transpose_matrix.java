import java.util.Scanner;

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        Solution solution = new Solution();
        int[][] result = solution.transpose(matrix);
        
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
