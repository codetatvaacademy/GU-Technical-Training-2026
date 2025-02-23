import java.util.*;

class Solution {
    public boolean isPossible(int n, int[] batteries, long mid) {
        long energy = 0;
        for (int battery : batteries) {
            energy += Math.min(battery, mid);
        }
        return energy >= mid * n;
    }

    public long maxRunTime(int n, int[] batteries) {
        long totalEnergy = 0;
        for (int battery : batteries) {
            totalEnergy += battery;
        }

        if (batteries.length == n) {
            return Arrays.stream(batteries).min().getAsInt();
        }

        long min = 0;
        long max = totalEnergy / n;
        long result = 0;

        while (min <= max) {
            long mid = min + (max - min) / 2;
            if (isPossible(n, batteries, mid)) {
                result = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of computers: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of batteries: ");
        int m = scanner.nextInt();
        int[] batteries = new int[m];

        System.out.println("Enter battery capacities: ");
        for (int i = 0; i < m; i++) {
            batteries[i] = scanner.nextInt();
        }

        System.out.println("Maximum Run Time: " + sol.maxRunTime(n, batteries));

        scanner.close();
    }
}
