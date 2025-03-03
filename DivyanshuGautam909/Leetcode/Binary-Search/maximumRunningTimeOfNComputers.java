import java.util.*;

class Solution {
    private boolean isValid(int[] batteries, int n, long midPower) {
        long requiredPower = midPower * n;
        long power = 0;
        for (int i = 0; i < batteries.length; i++) {
            power += Math.min(midPower, batteries[i]);
        }
        return power >= requiredPower;
    }

    public long maxRunTime(int n, int[] batteries) {
        long minPower = Integer.MAX_VALUE;
        long maxPower = 0;

        for (int i = 0; i < batteries.length; i++) {
            minPower = Math.min(minPower, batteries[i]);
            maxPower += batteries[i];
        }

        while (minPower <= maxPower) {
            long midPower = (minPower + maxPower) / 2;

            if (isValid(batteries, n, midPower)) {
                minPower = midPower + 1;
            } else {
                maxPower = midPower - 1;
            }
        }
        return maxPower;
    }
}

public class maximumRunningTimeOfNComputers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of computers (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of batteries: ");
        int m = scanner.nextInt();
        int[] batteries = new int[m];

        System.out.println("Enter the battery capacities:");
        for (int i = 0; i < m; i++) {
            batteries[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        long maxTime = solution.maxRunTime(n, batteries);
        System.out.println("Maximum running time of " + n + " computers: " + maxTime);

        scanner.close();
    }
}
