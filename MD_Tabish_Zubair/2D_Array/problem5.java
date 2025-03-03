import java.util.Scanner;

public class problem5 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length, n=mat[0].length;
        if(r*c!=m*n)
        return mat;
        int k=0;
        int[] a=new int[m*n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[k]=mat[i][j];
                k++;
            }
        }
        k=0;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=a[k];
                k++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the m");
        System.out.println("Enter the n");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int[][] ori=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ori[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the r");
        System.out.println("Enter the c");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        problem5 p=new problem5();
        arr=p.matrixReshape(ori,r,c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
