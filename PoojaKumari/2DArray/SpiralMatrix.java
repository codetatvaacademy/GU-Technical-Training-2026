import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SpiralMatrix{
    public  static List<Integer> spiralOrder(int[][] matrix) {
        int row1 = 0;
        int col1 = 0;
        int rowLength = matrix.length - 1;
        int colLength = matrix[0].length - 1;
        List<Integer> answer = new ArrayList<>();
        while (row1 <= rowLength && col1 <= colLength) {
            for (int col = col1; col <= colLength; col++) {
                answer.add(matrix[row1][col]);
            }
            for (int row = row1+1; row <= rowLength; row++) {
                answer.add(matrix[row][colLength]);
            }
            if (row1 < rowLength && col1 < colLength) {
                for (int col = colLength - 1; col >= col1; col--) {
                    answer.add(matrix[rowLength][col]);
                }
                for (int row = rowLength - 1; row > row1; row--) {
                    answer.add(matrix[row][col1]);
                }
            }
            row1++;
            col1++;
            rowLength--;
            colLength--;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of column: ");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> result=new ArrayList<>();
        result=spiralOrder(matrix);
        System.out.print(result);
        sc.close();
    }
}
