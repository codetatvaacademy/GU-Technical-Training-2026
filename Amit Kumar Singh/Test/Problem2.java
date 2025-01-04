//Time Complexity: O(n^2) && Space Complexity: O(n)
import java.util.*;

public class Problem2 {
    public static int[] reservedSeats(int n, int[][] bookings, int bn){
        int[] flights = new int[n];
        for(int i=0;i<n;i++){
            for(int[] booking : bookings){
                if(i+1>=booking[0] && i+1<=booking[1]){
                    flights[i] += booking[2];
                }
            }
        }

        return flights;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bn = sc.nextInt();
        int[][] bookings = new int[bn][3];
        for(int i=0;i<bn;i++){
            for(int j=0;j<3;j++){
                bookings[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(reservedSeats(n, bookings, bn)));
        sc.close();
    }
}
