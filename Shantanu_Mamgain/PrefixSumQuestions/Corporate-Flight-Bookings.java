import java.util.Arrays;
import java.util.Scanner;

public class CorporateFlightBookings {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
    
            int prefix[] = new int[n+1];
            for(int i=0; i<bookings.length ; i++){
    
                    int left= bookings[i][0]-1;
                    int right = bookings[i][1]-1;
                    prefix[left] += bookings[i][2];
                    prefix[right+1] -= bookings[i][2];
            }
    
            int [] answer = new int[n];
            answer[0]= prefix[0];
            for(int i =1; i<n; i++){
                answer[i] = answer[i-1]+ prefix[i];
            }
    
            return answer;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter number of flights: ");
            int n= sc.nextInt();
    
            System.out.print("Enter number of rows: ");
            int r =sc.nextInt();
    
            System.out.print("Enter number of columns: ");
            int c =sc.nextInt();
            int bookings[][] = new int[r][c];
    
            for(int i=0; i<r;i++){
                for(int j=0; j<c;j++){
                    bookings[i][j] = sc.nextInt();
                }
            }
    
            System.out.println(Arrays.toString(corpFlightBookings(bookings,n)));

    


        sc.close();
    }
}
