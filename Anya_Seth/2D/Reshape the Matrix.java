class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        if((rows * columns) != (r*c)){
            return mat;
        }
        int[][] result = new int[r][c];
        int i = 0 , j = 0;
        for(int k = 0 ; k < rows ; k++){
            for(int l = 0 ; l < columns ; l++){
                result[i][j] = mat[k][l];
                j++;
                if( j >= c){
                    j = 0;
                    i++;
                }
            }
        }
        return result;
    }
}
