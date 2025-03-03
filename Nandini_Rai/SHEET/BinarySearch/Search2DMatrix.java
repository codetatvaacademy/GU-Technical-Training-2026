import java.util.Scanner;

public class Search2DMatrix {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false; 
            }
    
            int m = matrix.length;
            int n = matrix[0].length;
            int min =0;
            int max = (m*n)-1;
            while(min<=max){
            int mid = min+(max-min)/2;
            int midValue = matrix[mid/n][mid%n];
            if(midValue==target){
                return true;
            }
            else if(midValue < target){
                min = mid + 1;
            }
            else{
                max = mid-1;
            }
            }
            return false;
        } 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        Search2DMatrix sm = new Search2DMatrix();
        boolean found = sm.searchMatrix(matrix, target);

        // Output result
        if (found) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Targe not found in the matrix.");
        }
    }

}
