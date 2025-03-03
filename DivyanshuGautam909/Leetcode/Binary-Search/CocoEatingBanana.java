import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt(); // Find max element in piles

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (canEat(piles, h, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    public static boolean canEat(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k);
        }
        return hours <= h;
    }
}

public class CocoEatingBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of piles: ");
        int n = scanner.nextInt();
        int[] piles = new int[n];

        System.out.println("Enter the banana piles:");
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of hours: ");
        int h = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.minEatingSpeed(piles, h);

        System.out.println("Koko's minimum eating speed is: " + result);

        scanner.close();
    }
}
