import java.util.Scanner;

public class RotateImage {
    public static int[][] rotate(int[][] matrix) {
        int rowLength=matrix.length;
         for(int i=0;i<rowLength;i++){
            for(int j=i;j<rowLength;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<rowLength/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][rowLength-1-j];
                matrix[i][rowLength-1-j]=temp;
            }
        }
        return matrix;
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
        int[][] result =rotate(mat);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            }
        }
         sc.close();
    }
}
