import java.util.Scanner;
class Problem3 {
        int[][] matrix;
        public Problem3(int[][] matrix) {
              int rows = matrix.length;// no of rows
            int colm = matrix[0].length;//no of columns in first roe
    
            //O(1) TIME COMPLEXITY
    
            for (int i = 1; i < rows; i++) {
                matrix[i][0] += matrix[i - 1][0];
            }
            for (int i = 1; i < colm; i++) {
                matrix[0][i] += matrix[0][i - 1];
            }
    
              for(int i = 1; i<rows ; i++){
                for(int j =1; j<colm ;j++){ 
                    matrix[i][j] += matrix[i][j - 1] + matrix[i - 1][j] - matrix[i - 1][j - 1];
                }
              }
                this.matrix =matrix;
        }
            
        public int sumRegion(int row1, int col1, int row2, int col2) {

            int top =0,left=0,topleft=0;
            if(row1>0){
                top = matrix[row1-1][col2];
            }
            if(col1>0){
                left = matrix[row2][col1-1];
            }
            if(row1>0 && col1>0){
                topleft = matrix[row1-1][col1-1];
            }
            return matrix[row2][col2] - top -left +topleft;
        } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input array length: ");
        int inputLen = sc.nextInt();

        String inputArray[] = new String[inputLen];

        for(int i=0; i<inputLen; i++){
            inputArray[i] = sc.next();
        }

        System.out.print("Enter row of matrix: ");
        int m= sc.nextInt();


        System.out.print("Enter col of matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];
        System.out.print("Enter elements of matix: ");
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int ans[] = new int[inputLen-1];

        Problem3 numMatrix = new Problem3(matrix);

        for(int i=1; i<inputArray.length; i++){
            System.out.print("Enter range for sum: ");
            System.out.print("Enter range for sum: ");
            int row1 = sc.nextInt();
            int row2 = sc.nextInt();
            int col1 = sc.nextInt();
            int col2 = sc.nextInt();
            ans[i-1] = numMatrix.sumRegion(row1, col1, row2, col2);
        }
        sc.close();
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}

