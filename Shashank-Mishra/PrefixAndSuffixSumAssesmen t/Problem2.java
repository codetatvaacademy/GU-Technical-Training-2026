import java.util.*;
public class problemTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the total number of flights");
        int n =sc.nextInt();

        System.out.println("Enter the size of row and colum of  the array");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int booking[][]=new int[r][c];
        System.out.println("Fill the value of array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                booking[i][j]=sc.nextInt();
            }
        }        
        int x= precompute(booking,n);
        System.out.println(x);
    }
    public static int precompute(int booking[][],int n)
    {
        int answer[]=new int [n+1];
        for(int i=0;i<=n;i++)
        {   int firsti =booking[i][0];
            int lasti =booking[i][1];
            int sisti =booking[i][n];
            for(int j=firsti;j<=lasti;j++)
            answer[i+1] +=sisti;
        }
        int totalPassengers = 0;
        for (int i = 1; i <= n; i++) {
            totalPassengers += answer[i];
        }

        return totalPassengers;

    }
    
    
}
