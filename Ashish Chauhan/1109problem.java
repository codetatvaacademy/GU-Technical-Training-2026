public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] seats = new int[n + 1];

        for (int[] booking : bookings) {
            int start = booking[0];
            int end = booking[1];
            int seatsBooked = booking[2];

            seats[start - 1] += seatsBooked;
            if (end < n) {
                seats[end] -= seatsBooked;
            }
        }
        int[] result = new int[n];
        result[0] = seats[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + seats[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution cfb = new Solution();
        int[][] bookings = {
            {1, 2, 10},
            {2, 3, 20},
            {2, 5, 25}
        };
        int n = 5;
        int[] result = cfb.corpFlightBookings(bookings, n);
        System.out.println("Seats booked on each flight: " + java.util.Arrays.toString(result)); 
    }
}
