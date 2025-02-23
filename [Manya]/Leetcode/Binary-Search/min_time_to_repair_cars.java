import java.util.*;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = (long) cars * cars * Arrays.stream(ranks).min().getAsInt(); 

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canRepairAll(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private boolean canRepairAll(int[] ranks, int cars, long time) {
        long totalCarsRepaired = 0;
        for (int rank : ranks) {
            totalCarsRepaired += (long) Math.sqrt(time / rank);  
        }
        return totalCarsRepaired >= cars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of mechanics: ");
        int n = scanner.nextInt();
        int[] ranks = new int[n];

        System.out.println("Enter the ranks of mechanics:");
        for (int i = 0; i < n; i++) {
            ranks[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of cars to repair: ");
        int cars = scanner.nextInt();

        Solution sol = new Solution();
        long result = sol.repairCars(ranks, cars);
        System.out.println("Minimum time required: " + result);

        scanner.close();
    }
}
