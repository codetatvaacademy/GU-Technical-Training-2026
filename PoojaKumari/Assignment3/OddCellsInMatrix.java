import java.util.Scanner;
public class OddCellsInMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] arr=new int[m][n];
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<n;j++){
                arr[row][j]++;
            }
            for(int j=0;j<m;j++){
                arr[j][col]++;
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
    return count;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of row:");
        int m=sc.nextInt();
        System.out.print("enter number of column:");
        int n=sc.nextInt();
        int[][] indices=new int[m][n];
        System.out.print("Enter the elements of indices:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                indices[i][j]=sc.nextInt();
            }
        }
        int result=oddCells(m,n,indices);
        System.out.print(result);
        sc.close();
    }
    
}
