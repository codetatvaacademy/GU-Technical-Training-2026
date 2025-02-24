import java.util.Scanner;

public class LocalValueInMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; i++){
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        int[][] ans = largestLocal(grid);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        
    }
    public static int[][] largestLocal(int[][] grid) {
        int[][] answer = new int[grid.length-2][grid.length-2];
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length; j++){
                answer[i][j] = calLocalMax(grid, i, j, i+2, j+2);
            }
        }
        return answer;
    }

    private static int calLocalMax(int[][] grid, int rowStart, int colStart, int rowEnd, int colEnd){
        int max = 0;
        for(int i=rowStart; i<=rowEnd; i++){
            for(int j=colStart; j<=colEnd; j++){
                if(max<grid[i][j]){
                    max = grid[i][j];
                }
            }
        }
        return max;
    }
}