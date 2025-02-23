import java.util.Scanner;

public class CountNegatives {
    public static  int countNegatives(int[][] grid) {
        int cnt=0;
        for(int[]row:grid){
            cnt+= countNinRows(row);
        }
        return cnt;
    }
    public static int countNinRows(int []rows){
        int low=0 ;
        int high=rows.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(rows[mid]<0){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return rows.length-low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the grid: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns in the grid: ");
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter the grid values :");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int result = countNegatives(grid);
        System.out.println("The number of negative numbers in the grid is: " + result);
    }
}
