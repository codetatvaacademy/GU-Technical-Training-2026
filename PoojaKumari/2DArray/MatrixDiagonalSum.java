import java.util.Scanner;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int rowLength=mat.length;
        //int colLength=mat[0].length;
        for(int i=0;i<rowLength;i++){
            if(i==rowLength-1-i){
                sum+=mat[i][i];
            }
            else{
                sum+=mat[i][i]+mat[i][rowLength-1-i];
            }
          

        }
        return sum;
        
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
        int result = 0;
        result=diagonalSum(mat);
        System.out.print(result);
         sc.close();
        
    }
}
