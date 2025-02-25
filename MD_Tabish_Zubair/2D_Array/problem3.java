import java.util.Scanner;

public class problem3 {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=mat[i][i];
            sum+=mat[i][n-1-i];
        }
        int k=n/2;
        if( (n)%2 == 1 )
        sum-=mat[k][k];
        return sum;
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
        problem3 p=new problem3();
        int ans=p.diagonalSum(arr);
        System.out.println(ans);

    }
}
