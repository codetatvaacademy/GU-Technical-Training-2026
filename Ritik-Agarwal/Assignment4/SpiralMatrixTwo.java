import java.util.Scanner;

public class SpiralMatrixTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[][] ans = generateMatrix(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int element = 1;
        int rowStart = 0;
        int colStart = 0;
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        while(rowStart<=row && colStart<=col){
            for(int j=colStart; j<=col; j++){
                matrix[rowStart][j] = element;
                element++;
            }
            for(int j=rowStart+1; j<=row; j++){
                matrix[j][col]=element;
                element++;
            }
            if (rowStart < row && colStart < col) {
                for(int j=col-1; j>=colStart; j--){
                    matrix[row][j] = element;
                    element++;
                }
                for(int j=row-1; j>rowStart; j--){
                    matrix[j][colStart] = element;
                    element++;
                }
            }
            rowStart++;
            colStart++;
            row--;
            col--;
        }
        return matrix;
    }
}