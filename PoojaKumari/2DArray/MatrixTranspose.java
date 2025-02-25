import java.util.Scanner;

public class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) {
        int rowLength=matrix.length;
        int colLength=matrix[0].length;
        int[][] result=new int[colLength][rowLength];
        for(int row=0;row<rowLength;row++){
            for(int col=0;col<colLength;col++){
                result[col][row]=matrix[row][col];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row length:");
        int row = sc.nextInt();
        System.out.print("Enter the column length:");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.print("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] result =transpose(mat);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            }
        }
         sc.close();
    }
}
