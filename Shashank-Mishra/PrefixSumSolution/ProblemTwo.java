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
        int[] x= corpFlightBookings(booking,n);
        System.out.println(Arrays.toString(x));
    }
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int flight[]=new int[n+1];
        int answer[] =new int[n];
        int first;
        int last;
            for(int i=0;i<bookings.length;i++)
            {
                 first = bookings[i][0]-1 ;
                 last = bookings[i][1]-1;
                flight[first] += bookings[i][2];
                flight[last+1] -= bookings[i][2];
            }
            for(int i=1;i<=n;i++)
            {
                flight[i] += flight[i-1];
            }
            for(int i=0;i<n;i++)
            {
                answer[i] =flight[i];
            }

            return answer;
    }
}
