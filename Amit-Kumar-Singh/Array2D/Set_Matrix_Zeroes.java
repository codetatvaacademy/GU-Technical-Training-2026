//Time Complexity: O(m*n)
//Space Compelxity: O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length,n=matrix[0].length;
        boolean firstRowIsZero = false;
        boolean firstColIsZero = false;
        for(int i : matrix[0]){
            if(i==0){
                firstRowIsZero = true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstColIsZero = true;
                break;
            }
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix[0][i] == 0){
                for(int j=1;j<m;j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int i=1;i<m;i++){
            if(matrix[i][0] == 0){
                for(int j=1;j<n;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowIsZero){
            for(int i=0;i<n;i++){
                matrix[0][i] = 0;
            }
        }
        if(firstColIsZero){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}