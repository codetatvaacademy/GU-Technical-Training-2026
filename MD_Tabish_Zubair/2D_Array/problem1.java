import java.util.*;
class problem1
{
    public int maximumWealth(int[][] accounts) {
        int k=0;
        int n=accounts.length;
        int m=accounts[0].length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum+=accounts[i][j];
                if(sum>k)
                k=sum;
            }
            
        }
        return k;
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
        problem1 p=new problem1();
        int ans=p.maximumWealth(arr);
        System.out.println(ans);

    }
}