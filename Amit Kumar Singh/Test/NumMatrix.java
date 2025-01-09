//Time Complexity: O(n*m) && Space Complexity: O(m*n)
//Incomplete constructor is implemented but sumRegion have mistakes
import java.util.Arrays;
import java.util.Scanner;

public class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix){
        this.matrix = matrix;

        for(int i=1;i<matrix[0].length;i++){
            matrix[0][i] += matrix[0][i-1];
        }
        for(int i=1;i<matrix.length;i++){
            matrix[i][0] += matrix[i-1][0];
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j] += matrix[i-1][j] + matrix[i][j-1]- matrix[i-1][j-1];
            }
        }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2){
        
        if(row1<1){
            return matrix[row2][col2] - matrix[row1][col2] - matrix[row2][col1-1];
        }
        return matrix[row2][col2] - matrix[row1-1][col2] - matrix[row2][col1-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns respectively: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        NumMatrix obj = new NumMatrix(matrix);

        System.out.println("Enter size of query list: ");
        n = sc.nextInt();
        for(int i =0;i<n;i++){
            int[] query = new int[4];
            for(int j=0;j<4;j++){
                query[j] = sc.nextInt();
            }
            System.out.println(obj.sumRegion(query[0],query[1],query[2],query[3]));
        }
        sc.close();
    }
}
