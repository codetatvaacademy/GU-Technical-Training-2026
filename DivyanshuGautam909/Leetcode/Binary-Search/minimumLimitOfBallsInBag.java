import java.util.*;

class Solution {
    private boolean isValid(int[] nums, int penalty, int maxOperations) {
        int maxOperation = 0;

        for (int num : nums) {
            if (num % penalty == 0 && num > penalty) {
                maxOperation = maxOperation + (num / penalty) - 1;
            } else if (num % penalty != 0 && num > penalty) {
                maxOperation = maxOperation + (num / penalty);
            }
        }
        return maxOperation <= maxOperations;
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int minBalls = 1;
        int maxBalls = 0;

        for (int num : nums) {
            maxBalls = Math.max(maxBalls, num);
        }

        while (minBalls <= maxBalls) {
            int penalty = (minBalls + maxBalls) / 2;

            if (isValid(nums, penalty, maxOperations)) {
                maxBalls = penalty - 1;
            } else {
                minBalls = penalty + 1;
            }
        }
        return minBalls;
    }
}

public class minimumLimitOfBallsInBag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the maximum number of operations: ");
        int maxOperations = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.minimumSize(nums, maxOperations);

        System.out.println("The minimum possible maximum number of balls in a bag is: " + result);

        scanner.close();
    }
}
