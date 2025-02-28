class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        boolean isFirstRow=false;
        boolean isFirstCol=false;
        for(int i=0; i<n; i++){
            if(matrix[i][0]==0){
                isFirstCol=true;
                break;
            }
        }
        for(int j=0; j<m; j++){
            if(matrix[0][j]==0){
                isFirstRow=true;
                break;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(isFirstCol){
            for(int i=0; i<n; i++){
                matrix[i][0]=0;
            }
        }
        if(isFirstRow){
            for(int j=0; j<m; j++){
                matrix[0][j]=0;
            }
        }
    }
}