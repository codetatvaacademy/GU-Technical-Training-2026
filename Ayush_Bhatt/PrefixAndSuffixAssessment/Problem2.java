import java.util.Arrays;

public class FlightBookings {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];
        for (int[] booking : bookings) {
            int firsti = booking[0] - 1; 
            int lasti = booking[1] - 1;
            int seatsi = booking[2];
            
            answer[firsti] += seatsi; 
            if (lasti + 1 < n) {  
                answer[lasti + 1] -= seatsi;
            }
        }
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[][] bookings1 = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        System.out.println(Arrays.toString(corpFlightBookings(bookings1, n1)));
        int n2 = 3;
        int[][] bookings2 = {{1, 3, 5}, {2, 2, 10}};
        System.out.println(Arrays.toString(corpFlightBookings(bookings2, n2)));
    }
}
//time complexity : O(n)
//space complexity : n
