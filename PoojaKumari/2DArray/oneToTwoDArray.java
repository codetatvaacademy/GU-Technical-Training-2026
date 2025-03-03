import java.util.Scanner;
public class oneToTwoDArray{
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result=new int[m][n];
        if(original.length!=m*n){
            return new int[0][0];
        }
        int row=0;int col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=original[i*n+j];
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the original array: ");
        int size = sc.nextInt();
        int[] original = new int[size];
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < size; i++) {
            original[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();
        int[][] result = construct2DArray(original, m, n);
        System.out.println("The 2D array is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
