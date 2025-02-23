public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        
        for(int col = 0; col < matrix[0].length; col++){
                if(matrix[0][col] == 0){
                  firstRow = true;
                  break;
                }
            }
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][0] == 0){
                  firstCol = true;
                  break;
                }
            }
            
            for(int i=1;i<matrix.length;i++){
                for(int j=1;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
    
            for(int i=1;i<matrix.length;i++){
                for(int j=1;j<matrix[0].length;j++){
                        if(matrix[i][0] == 0 || matrix[0][j] == 0){
                            matrix[i][j] = 0;
                        }
                }
            }
    
            if(firstRow == true){
                for(int col = 0; col < matrix[0].length; col++){
                    matrix[0][col] = 0;
                }
            }
    
            if(firstCol == true){
                for(int row = 0; row < matrix.length; row++){
                    matrix[row][0] = 0;
                }
            }
    }
    
    public static void main(String[] args) {
        SetZeroes setZeros = new SetZeroes();
        int[][] matrix = {{0,1,2,0},
                          {3,4,5,2},
                          {1,3,1,5}
                        };
        setZeros.setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
