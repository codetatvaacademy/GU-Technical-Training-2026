import java.util.Scanner;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMat = new int[r][c];
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int row = 0;
        int col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newMat[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }

            }
        }

        return newMat;
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
        System.out.print("Enter row:");
        int r=sc.nextInt();
        System.out.print("Enter col:");
        int c=sc.nextInt();
        int[][] result =matrixReshape(mat,r,c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(result[i][j]+" ");
            }
        }
         sc.close();
    }
}
