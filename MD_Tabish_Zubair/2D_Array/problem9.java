import java.util.Arrays;
import java.util.Scanner;

public class problem9 {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int[][] arr= new int [m][m];

        for(int i=0;i<m;i++)
        {
            for( int j=0;j<m;j++)
            {
                arr[i][j]=matrix[i][j];
            }
        }

        for(int i=0;i<m;i++)
        {
            for( int j=0;j<m;j++)
            {
                matrix[j][m-1-i]=arr[i][j];
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the rows");
        System.out.println("Enter the columns");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the array elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        problem9 p=new problem9();
        p.rotate(arr);
        System.out.println(Arrays.deepToString(arr));

    }
}
