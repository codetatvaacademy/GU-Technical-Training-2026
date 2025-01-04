import java.util.Scanner;

public class NumMatrix {
    static int[][] rowSum;
    private int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2; i++) {
            sum += col1 > 0 ? rowSum[i][col2] - rowSum[i][col1 - 1] : rowSum[i][col2];
        }
        return sum;
    }
    NumMatrix(int[][] matrix) {
        rowSum = matrix;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 1; j < matrix[i].length; j++) {
                rowSum[i][j] += matrix[i][j-1];
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter rows in matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter col in matrix: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        
        System.out.println("Enter elements in matrix: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Number of queries you want to enter: ");
        int Qnum = sc.nextInt();
        NumMatrix num = new NumMatrix(matrix);
        for(int i = 0; i < Qnum ;i++) {
            System.out.println("Enter query " + i+1 + " :");
            System.out.println("Row1 Col1 Row2 Col2: ");
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();
            int ans = num.sumRegion(row1, col1, row2, col2);
            System.out.println(ans);
        }
        // time complexity O(n)
        // Space complexity o(row*col)
        sc.close();
    }
}
