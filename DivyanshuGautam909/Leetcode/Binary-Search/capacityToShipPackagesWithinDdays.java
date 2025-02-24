import java.util.*;

class Solution {
    private boolean isPossible(int[] weights, int capacity, int days) {
        int weight = 0;
        int day = 1;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > capacity) {
                return false;
            } else if (weight + weights[i] <= capacity) {
                weight += weights[i];
            } else {
                day++;
                weight = weights[i];
            }
        }
        return day <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int min = 1;

        for (int i = 0; i < weights.length; i++) {
            max += weights[i];
        }

        while (min <= max) {
            int mid = (max + min) / 2;

            if (isPossible(weights, mid, days)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}

public class capacityToShipPackagesWithinDdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = scanner.nextInt();

        int[] weights = new int[n];
        System.out.println("Enter the weights of the packages:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        Solution solution = new Solution();
        int minCapacity = solution.shipWithinDays(weights, days);

        System.out.println("Minimum capacity needed to ship within " + days + " days: " + minCapacity);

        scanner.close();
    }
}
