package Sorting;

import java.util.*;

public class boatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;

        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                boats++;
                i++;
                j--;
            } else {
                j--;
                boats++;
            }
        }
        return boats;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        int[] people = new int[n];

        System.out.println("Enter the weights of people:");
        for (int i = 0; i < n; i++) {
            people[i] = scanner.nextInt();
        }

        System.out.print("Enter the boat weight limit: ");
        int limit = scanner.nextInt();

        scanner.close();

        boatsToSavePeople obj = new boatsToSavePeople();
        int result = obj.numRescueBoats(people, limit);

        System.out.println("Minimum number of boats required: " + result);
    }
}
