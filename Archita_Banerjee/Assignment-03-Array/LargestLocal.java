import java.util.Scanner;
public class LargestLocal {
    public static int[][] largestLocal(int[][] grid) {
        int n= grid.length;
        int[][] result= new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int maxVal=0;
                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        maxVal= Math.max(maxVal, grid[x][y]);
                    }
                }
                result[i][j]= maxVal;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the grid: ");
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        System.out.println("Enter the elements of the grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int[][] result = largestLocal(grid);
        System.out.println("Largest local values grid:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
