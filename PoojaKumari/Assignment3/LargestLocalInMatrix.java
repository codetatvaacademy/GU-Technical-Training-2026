import java.util.Scanner;
public class LargestLocalInMatrix {
    public static int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] generatedMatrix=new int[n-2][n-2];
        for(int row=0;row<n-2;row++){
            for(int col=0;col<n-2;col++){
                int max=0;
                for(int i=row;i<=row+2;i++){
                    for(int j=col;j<=col+2;j++){
                        max=Math.max(max,grid[i][j]);

                    }
                }
            generatedMatrix[row][col]=max;

            }
        }
    return generatedMatrix;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n=sc.nextInt();
        int[][] grid=new int[n][n];
        System.out.print("Enter elements of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int[][] result=new int[n-2][n-2];
        result=largestLocal(grid);
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                System.out.print(result[i][j]+" ");
            }
        }
        sc.close();

    }
}
