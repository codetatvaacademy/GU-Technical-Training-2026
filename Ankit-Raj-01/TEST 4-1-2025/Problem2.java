import java.util.Scanner;

public class Problem2 {
    //Funtion to find seats of each flight i
    private static int findSeats(int[][] booking, int ind) {
        int sum = 0;
        for(int i = 0; i < booking.length; i++) {
            if(booking[i][0] <= ind && booking[i][1]>= ind) {
                sum += booking[i][2];
            }
        }
        return sum;
    }
    // Function to find the overall seats of each flights
    private static void findReservedSeats(int[][] booking, int n) {
        
        int ans[] = new int[n+1];
        for(int i = 1; i <= n; i++) {

            ans[i] = findSeats(booking, i);
            System.out.println(i + " " + ans[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of flights: ");
        int n = sc.nextInt();
        System.out.println("How many inputs for booking: ");
        int num = sc.nextInt();
        int[][] booking = new int[num][3];
        System.out.println("Enter the booking details: ");
        for(int i = 0; i < num; i++) {
            System.out.print("Left " + i + " :");
            booking[i][0] = sc.nextInt();
            System.out.print("Right " + i + " :");
            booking[i][1] = sc.nextInt();
            System.out.println("seats " + i + " :");
            booking[i][2] = sc.nextInt();
        }

        findReservedSeats(booking, n);

        // Time complexity O(n*m) n is number of flights and m is number of bookings
        // Space O(n)
        sc.close();
    }
}
