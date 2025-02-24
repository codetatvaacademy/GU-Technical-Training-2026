import java.util.*;

class Solution {
    private boolean isPossible(int[] nums, int divisor, int threshold) {
        for (int i = 0; i < nums.length; i++) {
            threshold -= nums[i] / divisor;
            if (nums[i] % divisor != 0) {
                threshold--;
            }
        }
        return threshold >= 0;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int minDivisor = 1;
        int maxDivisor = 0;

        for (int i = 0; i < nums.length; i++) {
            maxDivisor = Math.max(maxDivisor, nums[i]);
        }

        while (minDivisor <= maxDivisor) {
            int divisor = (minDivisor + maxDivisor) / 2;

            if (isPossible(nums, divisor, threshold)) {
                maxDivisor = divisor - 1;
            } else {
                minDivisor = divisor + 1;
            }
        }
        return minDivisor;
    }
}

public class findTheSmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the threshold: ");
        int threshold = scanner.nextInt();

        Solution solution = new Solution();
        int smallestDivisor = solution.smallestDivisor(nums, threshold);

        System.out.println("The smallest divisor is: " + smallestDivisor);

        scanner.close();
    }
}
