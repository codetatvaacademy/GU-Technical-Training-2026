import java.util.Scanner;

public class problem4 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int a=original.length;
        if(m*n==a)
        {
            int[][] arr=new int[m][n];
            int c=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=original[c];
                    c++;
                }
            }
            return arr;
        }
        else 
        {
            int [][] arr=new int[0][0];
            return arr;
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the m");
        System.out.println("Enter the n");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter the length of original");
        int l=sc.nextInt();
        System.out.println("Enter the array elements");
        
        int[] ori=new int[l];
        for(int i=0;i<l;i++)
        {
            ori[i]=sc.nextInt();
        }
        problem4 p=new problem4();
        arr=p.construct2DArray(ori,m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
