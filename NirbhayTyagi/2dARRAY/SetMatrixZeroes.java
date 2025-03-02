import java.util.Scanner;

class SetMatrixZeroes{
    public static void setZeroes(int[][] matrix) {
        boolean isFirstRow = false; 
        boolean isFirstColumn = false;
 
        for(int col=0; col<matrix[0].length; col++){
         if(matrix[0][col]==0){
             isFirstRow = true;
             break;
         }
        }
        for(int row=0; row<matrix.length; row++){
         if(matrix[row][0]==0){
             isFirstColumn = true;
             break;
         }
        }
        for(int row=1; row<matrix.length; row++){
         for(int col=1; col<matrix[0].length; col++){
             if(matrix[row][col]==0){
                 matrix[row][0] = 0; 
                 matrix[0][col] = 0; 
             }
         }
        }
        for(int row=1; row<matrix.length; row++){
         for(int col=1; col<matrix[0].length; col++){
             if(matrix[row][col]!=0){
                 if(matrix[row][0]==0 || matrix[0][col]==0){
                     matrix[row][col] = 0;
                 }
             }
         }
        }
         if(isFirstRow == true){
             for(int col=0; col<matrix[0].length; col++){
                 matrix[0][col] = 0;
             }
         }
         if(isFirstColumn == true){
             for(int row=0; row<matrix.length; row++){
                 matrix[row][0] = 0;
             }
         }
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");  
        int m = sc.nextInt();
        System.out.println("Enter the no of column:");  
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the element of account: ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        setZeroes(matrix);
        System.out.println("The resultant matrix is: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

//time complexity of the function is : O(m * n)
//space complexity of the function is : O(1)

//time complexity of the whole program is : O(m * n)
//space complexity of the whole program is : O(m * n)