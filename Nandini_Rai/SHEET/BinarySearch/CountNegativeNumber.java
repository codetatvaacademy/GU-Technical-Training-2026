import java.util.Scanner;

public class CountNegativeNumber {
        public int countNegatives(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count=0;
            for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                if(grid[i][j]<0){
                    count++;
                }
               }
            }
            return count;
        }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
      CountNegativeNumber cn = new CountNegativeNumber();
        int result = cn.countNegatives(grid);
        System.out.println(result);
    }
}
