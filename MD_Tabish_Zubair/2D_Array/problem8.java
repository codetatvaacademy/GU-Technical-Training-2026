import java.util.Arrays;
import java.util.Scanner;

public class problem8 {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int r1=0 , c1=0;
        int r2=n-1 , c2=n-1;
        
    int k=1;
    while(r1<=r2 && c1<=c2)
    {
        //left
        for(int i=c1; i<=c2; i++)
        {
            arr[r1][i]=k;
            k++;
        }
        //down
        for(int i=r1+1;i<=r2;i++)
        {
            arr[i][c2]=k;
            k++;
        }
        if(r1<r2 && c1<c2)
        {
            //right
            for(int i=c2-1;i>=c1;i--)
            {
                arr[r2][i]=k;
                k++;
            }
            //up
            for(int i=r2-1;i>r1;i--)
            {
                arr[i][c1]=k;
                k++;

            }
        }
        r1++;
        c1++;
        r2--;
        c2--;
    }
    return arr;
    }
     public static void main(String[] args) {
        System.out.println("Enter the n");
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        problem8 p=new problem8();
        int[][] ans=p.generateMatrix(n);
        System.out.println(Arrays.deepToString(ans));

    }
}
