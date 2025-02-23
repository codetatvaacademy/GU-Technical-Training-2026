import java.util.Scanner;

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }

        if(n % 2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        
        int[][] mat = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        
        Solution solution = new Solution();
        int result = solution.diagonalSum(mat);
        
        System.out.println("Sum of diagonals: " + result);
        
        scanner.close();
    }
}
