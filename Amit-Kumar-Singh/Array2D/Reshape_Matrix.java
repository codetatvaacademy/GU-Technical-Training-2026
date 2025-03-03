//Time Complexity: O(m*n)
//Space Complexity: O(m*n)
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if((rows * cols) != (r * c)){
            return mat;
        }
        int[][] result = new int[r][c];
        int resRows = 0;
        int resCols = 0;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[resRows][resCols] = mat[i][j];
                resCols++;
                if(resCols == c)
                {
                    resCols = 0;
                    resRows++;
                }
            }
        }
        return result;
    }
}