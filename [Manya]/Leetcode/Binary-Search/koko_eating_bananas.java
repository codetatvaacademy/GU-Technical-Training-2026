import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = Arrays.stream(piles).max().getAsInt();

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (canEat(piles, h, mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private static boolean canEat(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  
        }
        return hours <= h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = scanner.nextInt();
        int[] piles = new int[n];

        System.out.println("Enter banana piles:");
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }

        System.out.print("Enter available hours (h): ");
        int h = scanner.nextInt();

        Solution sol = new Solution();
        int result = sol.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);

        scanner.close();
    }
}
