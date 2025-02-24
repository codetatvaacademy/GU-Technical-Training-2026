//Time Complexity: O(n+m) && Space Complexity: O(n+m)
import java.util.*;

public class Problem2 {
    public static int[] reservedSeats(int n, int[][] bookings){
        int[] answer = new int[n];
        for(int[] booking : bookings){
            answer[booking[0]-1] += booking[2];
            if(booking[1]<n){
                answer[booking[1]] -= booking[2];
            }
        }
        for(int i=1;i<n;i++){
            answer[i] += answer[i-1];
        }
        return answer;
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
        System.out.println(Arrays.toString(reservedSeats(n, bookings)));
        sc.close();
    }
}
