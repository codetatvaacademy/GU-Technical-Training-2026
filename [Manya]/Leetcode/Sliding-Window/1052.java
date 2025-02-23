import java.util.Scanner;

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unSatisfiedCustomers = 0;
        for (int i = 0; i < minutes; i++) {
            unSatisfiedCustomers += grumpy[i] * customers[i];
        }
        int maxUnsatisfiedCustomers = unSatisfiedCustomers;

        for (int i = minutes; i < customers.length; i++) {
            unSatisfiedCustomers += grumpy[i] * customers[i];
            unSatisfiedCustomers -= grumpy[i - minutes] * customers[i - minutes];
            maxUnsatisfiedCustomers = Math.max(maxUnsatisfiedCustomers, unSatisfiedCustomers);
        }

        int maxSatisfiedCustomers = maxUnsatisfiedCustomers;

        for (int i = 0; i < customers.length; i++) {
            maxSatisfiedCustomers += (1 - grumpy[i]) * customers[i];
        }
        return maxSatisfiedCustomers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        int[] customers = new int[n];
        int[] grumpy = new int[n];

        System.out.println("Enter the number of customers per minute:");
        for (int i = 0; i < n; i++) {
            customers[i] = scanner.nextInt();
        }

        System.out.println("Enter the grumpy array (0 for not grumpy, 1 for grumpy):");
        for (int i = 0; i < n; i++) {
            grumpy[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of minutes the owner can keep calm: ");
        int minutes = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.maxSatisfied(customers, grumpy, minutes);

        System.out.println("Maximum number of satisfied customers: " + result);

        scanner.close();
    }
}
