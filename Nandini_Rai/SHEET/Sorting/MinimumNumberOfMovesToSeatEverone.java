
import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberOfMovesToSeatEverone {
    public int minMovesToSeat(int[] seats, int[] students) {
        int result=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
          result += Math.abs(seats[i]-students[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seats[] = new int[n];
        for(int i=0;i<seats.length;i++){
            seats[i] = sc.nextInt();
        }
        int students[] = new int[n];
        for(int i=0;i<seats.length;i++){
            students[i] = sc.nextInt();
        }
        MinimumNumberOfMovesToSeatEverone ms = new MinimumNumberOfMovesToSeatEverone();
        System.out.println(ms.minMovesToSeat(seats, students));
    }
}
