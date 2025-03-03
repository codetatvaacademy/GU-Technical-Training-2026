import java.util.Scanner;

public class grumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unsatisfiedCustomer = 0;

        for (int i = 0; i < minutes; i++) {
            unsatisfiedCustomer += grumpy[i] * customers[i];
        }

        int maxUnsatisfiedCustomer = unsatisfiedCustomer;

        for (int i = minutes; i < customers.length; i++) {
            unsatisfiedCustomer += grumpy[i] * customers[i];
            unsatisfiedCustomer -= grumpy[i - minutes] * customers[i - minutes];
            maxUnsatisfiedCustomer = Math.max(maxUnsatisfiedCustomer, unsatisfiedCustomer);
        }

        int maxSatisfiedCustomer = maxUnsatisfiedCustomer;

        for (int i = 0; i < customers.length; i++) {
            maxSatisfiedCustomer += (1 - grumpy[i]) * customers[i];
        }
        return maxSatisfiedCustomer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = scanner.nextInt();

        int[] customers = new int[n];
        int[] grumpy = new int[n];

        System.out.println("Enter customers array: ");
        for (int i = 0; i < n; i++) {
            customers[i] = scanner.nextInt();
        }

        System.out.println("Enter grumpy array: ");
        for (int i = 0; i < n; i++) {
            grumpy[i] = scanner.nextInt();
        }

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        scanner.close();

        grumpyBookstoreOwner obj = new grumpyBookstoreOwner();
        int result = obj.maxSatisfied(customers, grumpy, minutes);
        System.out.println("Maximum number of satisfied customers: " + result);
    }
}
