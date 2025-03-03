import java.util.*;
class NumMatrix{
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
         for(int i=1;i<matrix.length;i++){
            matrix[i][0]+=matrix[i-1][0];
        }
        for(int j=1;j<matrix[0].length;j++){
            matrix[0][j]+=matrix[0][j-1];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j]+=matrix[i-1][j]+matrix[i][j-1]-matrix[i-1][j-1];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 < 0 || col1 < 0 || row2 >= matrix.length || col2 >= matrix[0].length) {
            return 0;
        }
        int sum = matrix[row2][col2];
        if (row1 > 0) {
            sum -= matrix[row1 - 1][col2]; 
        }
        if (col1 > 0) {
            sum -= matrix[row2][col1 - 1]; 
        }
        if (row1 > 0 && col1 > 0) {
            sum += matrix[row1 - 1][col1 - 1]; 
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] matrix = {{3,0,1,4,2},
                          {5,6,3,2,1},
                          {1,2,0,1,5},
                          {4,1,0,1,7},
                          {1,0,3,0,5}};

        NumMatrix obj=new NumMatrix(matrix);

        System.out.println("[null , "+obj.sumRegion(2,1,4,3)+" , "+obj.sumRegion(1,1,2,2)+" , "+obj.sumRegion(1,2,2,4)+"]");
    }
}
//Time Complexity: O(1) for sumRange()
//Space Complexity: O(n^2)
//where n is the length of array matrix