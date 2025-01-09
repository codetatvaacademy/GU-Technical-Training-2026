import java.util.Arrays;
import java.util.Scanner;
public class problem2 {  
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] tempArray = new int[n+1];
        int[] answer = new int[n];

        for(int i = 0; i < bookings.length; i++){
            tempArray[bookings[i][0] - 1] = tempArray[bookings[i][0] - 1] + bookings[i][2];
            tempArray[bookings[i][1]] = tempArray[bookings[i][1]] - bookings[i][2];
        }
        answer[0] = tempArray[0];
        for(int i = 1; i < n; i++){
            answer[i] = tempArray[i] + answer[i-1];
        }
        return answer;
            
    }
    public static void main(String[] args) {

        problem2 obj = new problem2();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of flight: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of bookings:  ");
        int m = sc.nextInt();
        
        int[][] bookings = new int[m][3];
        System.out.println("Enter the booking formate [first-flight,last-flight,reserve-seat]");
        for(int i = 0; i< m; i++){
            System.out.print("Booking "+ (i + 1));
            bookings[i][0] = sc.nextInt();
            bookings[i][1] = sc.nextInt();
            bookings[i][2] = sc.nextInt();
        }
        
        int[] answer = obj.corpFlightBookings(bookings, n);
        System.out.println(Arrays.toString(answer));
        sc.close();
    }
    
}
