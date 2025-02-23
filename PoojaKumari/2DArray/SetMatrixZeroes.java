import java.util.Scanner;

class SetMatrixZeroes{
    private static void setZeroes(int[][] matrix) {
        Boolean isFirstRowZero = false;
        Boolean isFirstColZero = false;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for (int i = 0; i < colLength; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowZero = true;
            }
        }
        for (int j = 0; j < rowLength; j++) {
            if (matrix[j][0] == 0) {
                isFirstColZero = true;
            }
        }
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < colLength; i++) {
            if (isFirstRowZero == true) {
                matrix[0][i] = 0;
            }

        }
        for (int i = 0; i < rowLength; i++) {
            if (isFirstColZero == true) {
                matrix[i][0] = 0;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of row: ");
        int row=sc.nextInt();
        System.out.print("Enter length of column: ");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        setZeroes(matrix);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();

       
        
    }
}
