class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isRowZero = false;
        boolean isColZero = false;
        int row = matrix.length;
        int col = matrix[0].length;

        for(int c = 0; c < col; c++ ){
            if(matrix[0][c] == 0){
                isRowZero = true;
                break;
            }
        }

        for(int r = 0; r < row; r++){
            if(matrix[r][0] == 0){
                isColZero = true;
                break;
            }
        }

        for(int r = 1; r < row; r++){
            for(int c = 1; c < col; c++){
                if( matrix[r][c] == 0){
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }

        for(int r = 1; r < row; r++){
            for(int c = 1; c < col; c++){
                if(matrix[0][c] == 0 || matrix[r][0] == 0){
                    matrix[r][c] = 0;
                }
            }
        }

        if(isRowZero == true){
            for(int c = 0; c < col; c++){
                matrix[0][c] = 0;
            }
        }

        if(isColZero == true){
            for(int r = 0; r < row; r++){
                matrix[r][0] = 0;
            }
        }

    }
}
