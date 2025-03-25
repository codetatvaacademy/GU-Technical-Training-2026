class Solution {
    public void rowIncrement(int matrix[][], int i){
        for(int col = 0; col < matrix[0].length; col++){
            matrix[i][col] ++;
        }
    }
    public void colIncrement(int matrix[][], int j){
        for(int row = 0; row < matrix.length; row++){
            matrix[row][j] ++;
        }
    }

    public int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        for(int i = 0; i < indices.length; i++){
            rowIncrement(matrix, indices[i][0]);
        }
        for(int i = 0; i < indices.length; i++){
            colIncrement(matrix, indices[i][1]);
        }

        int count = 0;

        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] %2 != 0){
                    count++;
                }
            }
        }

        return count;

    }
}
