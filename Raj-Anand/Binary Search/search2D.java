class search2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int i=0,j=rows*cols-1;
        int mid;
        while(i<=j){
            mid=(i+j)/2;
            int row=mid/cols;
           int  col=mid%cols;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
            
        }
        return false;
        
        
    }
}
