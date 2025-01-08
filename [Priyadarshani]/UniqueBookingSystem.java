public class UniqueBookingSystem {
    public int[] flightBookings(int[][] bookings, int n) {
        int[] diff = new int[n + 2]; 

        for (int[] booking : bookings) {
            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];

            diff[first] += seats;       
            diff[last + 1] -= seats; 
        }
        int[] result = new int[n];
        int currentSeats = 0;
        for (int i = 1; i <= n; i++) {
            currentSeats += diff[i];    
            result[i - 1] = currentSeats; 
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int n= 5;

        int[][] bookings1 = {{1,3,5},{2,2,10}};
        int n1= 3;

        UniqueBookingSystem obj = new UniqueBookingSystem();
        System.out.println(Arrays.toString(obj.flightBookings(bookings, n)));
        System.out.println(Arrays.toString(obj.flightBookings(bookings1, n1)));
    }
}

// Time Complexity: O(n+m) : n for number of flights and m is number of bookings
// Space Complexity: O(n) 
