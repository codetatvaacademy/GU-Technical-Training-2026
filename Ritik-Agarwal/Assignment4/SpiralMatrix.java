import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();

        List<Integer> ans = spiralOrder(grid);
        System.out.println(ans);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int row1 = 0, row2 = matrix.length-1, col1 = 0, col2 = matrix[0].length-1;
        List<Integer> order = new ArrayList<>();
        while(row1<=row2 && col1<=col2){
            for(int col = col1; col<=col2; col++){
                order.add(matrix[row1][col]);
            }
            for(int row = row1+1; row<=row2; row++){
                order.add(matrix[row][col2]);
            }
            if(row1<row2 && col1<col2){
                for(int col=col2-1; col>=col1; col--){
                    order.add(matrix[row2][col]);
                }
                for(int row = row2-1; row>row1; row--){
                    order.add(matrix[row][col1]);
                }
            }
            col1++; row1++; col2--; row2--;
        }
        return order;
    }
}