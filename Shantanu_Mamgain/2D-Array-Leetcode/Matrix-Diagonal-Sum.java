class Solution {
    public int diagonalSum(int[][] mat) {
        int j =mat.length-1;
        int count  =0;
        if(mat.length == 1){
            return mat[0][0];  
        }
        for(int i = 0; i < mat.length; i++){
            
            count += mat[i][i];
            count += mat[i][j];
            j--;
        }
        if(mat.length%2 != 0){
            count -= mat[(mat.length-1)/2][(mat.length-1)/2];
        }

        return count;
    }
}
