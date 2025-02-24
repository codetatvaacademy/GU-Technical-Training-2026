import java.util.Scanner;

public class Fgrumphybookstoreowner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unsatisfied = 0;
        for (int i = 0; i < minutes; i++) {
            unsatisfied += customers[i] * grumpy[i];

        }
        int maxUnsatisfied = unsatisfied;
        int start = 0;
        int end = minutes;
        while (end < grumpy.length) {
            unsatisfied = unsatisfied - (customers[start] * grumpy[start]) + (customers[end] * grumpy[end]);
            maxUnsatisfied = Math.max(maxUnsatisfied, unsatisfied);
            start++;
            end++;

        }
        int satisfied = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }
        return maxUnsatisfied + satisfied;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] customers = new int[size];
        int[] grumpy = new int[size];
        for (int i = 0; i < size; i++) {
            customers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            grumpy[i] = sc.nextInt();
        }
        int minutes = sc.nextInt();
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
}
