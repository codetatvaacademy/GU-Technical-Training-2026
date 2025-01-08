//Time Complexity: O(n*m+q) && Space Complexity: O(m*n+q)
import java.util.Scanner;

public class NumMatrix {

    int[][] matrix;

    public NumMatrix(int[][] matrix) {
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
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int upperRightRegionSum = 0;
        int lowerLeftRegionSum = 0;
        int diagonal = 0;

        if(row1!=0){
            upperRightRegionSum = matrix[row1-1][col2];
        }

        if(col1!=0){
            lowerLeftRegionSum = matrix[row2][col1-1];
        }

        if(row1!=0 && col1!=0){
            diagonal = matrix[row1-1][col1-1];
        }

        return matrix[row2][col2] - upperRightRegionSum - lowerLeftRegionSum + diagonal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns respectively: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        
        System.out.print("Enter the values of the array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        NumMatrix obj = new NumMatrix(matrix);

        System.out.print("Enter size of query list: ");
        n = sc.nextInt();
        int[][] sumQuery = new int[n][4];
        System.out.print("Enter row and col of top left corner and bottom right corner");

        for(int i =0;i<n;i++){
            int[] query = new int[4];
            for(int j=0;j<4;j++){
                query[j] = sc.nextInt();
            }
            sumQuery[i] = query;    
        }

        for(int i=0;i<n;i++){
            System.out.println(obj.sumRegion(sumQuery[i][0],sumQuery[i][1],sumQuery[i][2],sumQuery[i][3]));
        }

        sc.close();
    }
}
