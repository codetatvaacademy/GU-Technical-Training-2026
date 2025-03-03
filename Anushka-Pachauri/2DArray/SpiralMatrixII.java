class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int count=1;
        int r1=0;
        int c1=0;
        int r2=n-1;
        int c2=n-1;
        while(r1<=r2 && c1<=c2){
            for(int c=c1;c<=c2;c++){
                matrix[r1][c]=count++;
            }
            for(int r=r1+1;r<=r2;r++){
                matrix[r][c2]=count++;
            }
            if(r1<r2 && c1<c2){
                for(int c=c2-1;c>=c1;c--){
                    matrix[r2][c]=count++;
                }
                for(int r=r2-1;r>c1;r--){
                    matrix[r][c1]=count++;
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return matrix;
    }
}