import java.util.*;

public class MaxSatisfiedCustomers {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int maxUnsat = 0, Unsat = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                Unsat += customers[i];
            }
        }

        maxUnsat = Unsat;
        int i = 0, j = minutes;
        
        while (j < n) {
            Unsat += customers[j] * grumpy[j];
            Unsat -= customers[i] * grumpy[i];
            maxUnsat = Math.max(maxUnsat, Unsat);
            i++;
            j++;
        }

        int total = maxUnsat;
        for (int p = 0; p < n; p++) {
            if (grumpy[p] == 0) {
                total += customers[p];
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minutes = sc.nextInt();
        int[] customers = new int[n], grumpy = new int[n];

        for (int i = 0; i < n; i++) customers[i] = sc.nextInt();
        for (int i = 0; i < n; i++) grumpy[i] = sc.nextInt();

        MaxSatisfiedCustomers sol = new MaxSatisfiedCustomers();
        System.out.println(sol.maxSatisfied(customers, grumpy, minutes));

        sc.close();
    }
}
