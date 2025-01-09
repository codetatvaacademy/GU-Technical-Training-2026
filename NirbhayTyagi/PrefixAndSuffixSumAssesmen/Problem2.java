package NirbhayTyagi.PrefixAndSuffixSumAssesmen;

import java.util.*;

class Problem2 {
    public static int[] calculateSeatReservations(int n, int[][] bookings) {
        int[] seats = new int[n];

        for (int[] booking : bookings) {
            int first = booking[0] - 1;
            int last = booking[1] - 1;
            int seatsToAdd = booking[2];

            seats[first] += seatsToAdd;

            if (last + 1 < n) {
                seats[last + 1] -= seatsToAdd;
            }
        }

        for (int i = 1; i < n; i++) {
            seats[i] += seats[i - 1];
        }

        return seats;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of flights: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of bookings: ");
        int m = sc.nextInt();
        int[][] bookings = new int[m][3];
        System.out.println("Enter bookings in the format [first, last, seats]:");
        for (int i = 0; i < m; i++) {
            System.out.print("Booking " + (i + 1) + ": ");
            bookings[i][0] = sc.nextInt();
            bookings[i][1] = sc.nextInt();
            bookings[i][2] = sc.nextInt();
        }
        int[] result = calculateSeatReservations(n, bookings);
        System.out.println("Total seats reserved for each flight: " + Arrays.toString(result));
        sc.close();
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n+m)