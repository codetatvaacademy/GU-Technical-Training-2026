import java.util.Scanner;

class Solution {
    public boolean isPossible(int[] weights, int capacity, int days) {
        int weight = 0, countDays = 1;

        for (int i = 0; i < weights.length; i++) {
            if (weight + weights[i] > capacity) {
                countDays++; 
                weight = weights[i]; 
                if (countDays > days) {
                    return false;
                }
            } else {
                weight += weights[i];
            }
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = 0, min = 0;

        for (int weight : weights) {
            max += weight;  
            min = Math.max(min, weight); 
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (isPossible(weights, mid, days)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = scanner.nextInt();
        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        Solution sol = new Solution();
        int minCapacity = sol.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity required: " + minCapacity);

        scanner.close();
    }
}
