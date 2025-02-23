//Time Complexity: O(n^2)
//Space Complexity: O(1)
class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int temp=-1001;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
    }
}