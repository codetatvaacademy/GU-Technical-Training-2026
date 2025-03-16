import java.util.*;

public class NumMatrix {
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            int extraSum = 0;
            if (col1 != 0) {
                extraSum = matrix[i][col1 - 1];
            }
            sum += matrix[i][col2] - extraSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter matrix of elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter row1 of sumRegion :");
        int row1=sc.nextInt();
        System.out.println("Enter col1 of sumRegion :");
        int col1=sc.nextInt();
        System.out.println("Enter row2 of sumRegion :");
        int row2=sc.nextInt();
        System.out.println("Enter col2 of sumRegion :");
        int col2=sc.nextInt();
        


        NumMatrix answer=new NumMatrix(matrix);
        System.out.print(answer.sumRegion(row1, col1, row2, col2));
        sc.close();
        
    }

}
