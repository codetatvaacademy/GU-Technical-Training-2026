import java.util.*;
public class SpiralMatrixII {
    public  static int[][] generateMatrix(int n) {
        int[][] answer=new int[n][n];
        int num=1;
        int row1 = 0;
        int col1 = 0;
        int rowLength = answer.length - 1;
        int colLength = answer[0].length - 1;
        while (row1 <= rowLength && col1 <= colLength) {
            for (int c = col1; c <= colLength; c++) {
                answer[row1][c]=num++;
            }
            for (int row = row1+1; row <= rowLength; row++) {
                answer[row][colLength]=num++;

            }
            if (row1 < rowLength && col1 < colLength) {
                for (int col = colLength - 1; col >= col1; col--) {
                    answer[rowLength][col]=num++;
                }
                for (int row = rowLength - 1; row > row1; row--) {
                    answer[row][col1]=num++;
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
        int n=sc.nextInt();
        int[][] answer=new int[n][n];
        answer=generateMatrix(n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(answer[i][j]+ " ");

            }
        }
        sc.close();
    }
   
    
}
