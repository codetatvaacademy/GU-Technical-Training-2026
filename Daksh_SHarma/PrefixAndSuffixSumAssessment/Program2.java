import java.util.Scanner;

public class Program2 {
    public static int calculateReserveSeats(int arr[][],int ans[x])
    {

    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("enter the row size of a 2-d array :");
        int m=sc.nextInt();
        System.out.print("enter the column size of a 2-d array :");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
           
        }
        System.out.print("enter the number of flights:");
        int x=sc.nextInt();
        int ans[]=new int[x];
        calculateReserveSeats(arr[m][n],ans[x]);
    
    }
    
}
