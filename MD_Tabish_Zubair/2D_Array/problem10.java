import java.util.Arrays;
import java.util.Scanner;

public class problem10 {
    public void setZeroes(int[][] matrix) {
        boolean sR=false;
        boolean  sC=false;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                sC=true;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(matrix[0][i]==0)
            {
                sR=true;
                break;
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1; j<n;j++)
            {
                if( matrix[i][j] == 0 )
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1; j<n;j++)
            {
                if( matrix[i][0]==0 || matrix[0][j]==0 )
                {
                    matrix[i][j] = 0;
                }
            }
        }

        if(sR==true)
        {
            for(int i=0;i<n;i++)
            {
                matrix[0][i]=0;
            }
        }

        if(sC==true)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][0]=0;
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
        problem10 p=new problem10();
        p.setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));

    }
}
