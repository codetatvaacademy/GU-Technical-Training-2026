import java.util.Scanner;

public class NumMatrix {
        private int[][] prefixSum;

        public NumMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            // Initializing the prefix sum matrix
            prefixSum = new int[rows + 1][cols + 1];

            // Computing the prefix sum matrix
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + matrix[i - 1][j - 1];
                }
                // O(n^2) time complexity O(1)
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            row1++;
            col1++;
            row2++;
            col2++;

            // Calculate the sum using the prefix sum matrix
            return prefixSum[row2][col2] - prefixSum[row1 - 1][col2] - prefixSum[row2][col1 - 1] + prefixSum[row1 - 1][col1 - 1];
        }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] matrix = new int[row][col];
        
        System.out.println("Enter elements of matrix: ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter row and column: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        NumMatrix obj= new NumMatrix(matrix);
        int sum = obj.sumRegion(row1,col1,row2,col2);
        System.out.println(sum);
    }
}

