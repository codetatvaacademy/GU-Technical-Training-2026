import java.util.Scanner;

public class problem2 {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]<0)
                {sum+=m-j;
                break;}
            }
        }
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
        problem2 p=new problem2();
        int ans=p.countNegatives(arr);
        System.out.println(ans);

    }
}
