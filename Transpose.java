import java.util.Scanner;
import java.util.Arrays;
class Transpose {
    public int[][] transpose(int[][] matrix) {
        int [][]mat = new int [matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[j][i]=matrix[i][j];
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Transpose obj = new Transpose();
        int [][]result = obj.transpose(matrix);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}