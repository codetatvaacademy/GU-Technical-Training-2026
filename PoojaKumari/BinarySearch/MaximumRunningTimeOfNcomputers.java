import java.util.*;

public class MaximumRunningTimeOfNcomputers {
    public static long maxRunTime(int n, long[] batteries) {
        long sum = 0;
        for (int i = 0; i < batteries.length; i++) {
            sum += batteries[i];
        }
        long min = 0;
        long max = sum;

        long answer = 0;
        while (min <= max) {
            long mid = (min + max) / 2;

            if (isPossible(n, mid, batteries)) {
                answer = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return answer;

    }

    public static boolean isPossible(int n, long mid, long[] batteries) {
        long result = mid * n;
        long sum = 0;
        for (int i = 0; i < batteries.length; i++) {
            sum += Math.min((long) batteries[i], mid);
            if (sum >= result) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of computers:");
        int n = sc.nextInt();
        System.out.println("Enter size of array of batteries: ");
        int m = sc.nextInt();
        long[] batteries = new long[m];
        for (int i = 0; i < m; i++) {
            batteries[i] = sc.nextInt();
        }
        long answer;
        answer = maxRunTime(n, batteries);
        System.out.println(answer);
        sc.close();
    }
}
