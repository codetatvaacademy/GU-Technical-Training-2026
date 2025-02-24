import java.util.Scanner;

public class SetZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        setZeroes(matrix);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] matrix) {
        boolean isFirstRowZero = false, isFirstColZero = false;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]==0){
                isFirstColZero = true;
                break;
            }
        }
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i]==0){
                isFirstRowZero = true;
                break;
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){ 
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){ 
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(isFirstRowZero){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i]=0;
            }
        }
        if(isFirstColZero){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0]=0;
            }
        }
    }
}