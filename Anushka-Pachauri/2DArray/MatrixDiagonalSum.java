class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int diagonalSum=0;
        for(int i=0;i<mat.length;i++){
            diagonalSum+=mat[i][i];
            if(i!=mat.length-1-i){
                diagonalSum+=mat[i][mat.length-1-i];
            }
        }
        return diagonalSum;
    }
}