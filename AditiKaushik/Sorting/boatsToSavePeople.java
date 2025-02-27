// 881. Boats to Save People

import java.util.Arrays;
import java.util.Scanner;

class boatsToSavePeople{
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int min = 0;
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            min++;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter the weight of person " + (i+1) + " : ");
            people[i] = sc.nextInt();
        }
        System.out.println("Enter the maximum weight each boat can carry: ");
        int limit = sc.nextInt();
        System.out.println(numRescueBoats(people, limit));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(1)