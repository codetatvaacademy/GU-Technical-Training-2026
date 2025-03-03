package BinarySearchAssessment;

import java.util.*;
class Problem2 {
    public static int hours(int[] piles, int k) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1) / k;
        }
        return totalHours;
    }
    public static int speed(int[] piles, int h) {
        int starting = 1;
        int ending = piles[piles.length-1];
        int result = ending;
        while (starting <= ending) {
            int mid = (starting + ending) / 2;
            if (hours(piles, mid) <= h) {
                result = mid;
                ending = mid - 1;
            } else {
                starting = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of piles: ");
        int n = sc.nextInt();
        int[] piles = new int[n];
        System.out.print("Enter the sizes of the piles: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        Arrays.sort(piles);
        System.out.print("Enter the number of hours (h): ");
        int h = sc.nextInt();
        System.out.println("Minimum eating speed: " + speed(piles, h));
        sc.close();
    }
}
//Complexity of whole program:
//Time: O(n) + O(nlog n)
//Space: O(n)

//Complexity of function:
//Time: O(nlog n)
//Space: O(1)
