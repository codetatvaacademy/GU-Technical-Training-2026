package Sorting;

import java.util.*;

public class smallestRange2 {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int score = nums[nums.length - 1] - nums[0];
        int bestL = nums[0] + k;
        int bestR = nums[nums.length - 1] - k;

        for (int i = 0; i < nums.length - 1; i++) {
            int min = Math.min(nums[i + 1] - k, bestL);
            int max = Math.max(nums[i] + k, bestR);
            score = Math.min(score, max - min);
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in nums
        System.out.print("Enter the number of elements in nums: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        scanner.close();

        smallestRange2 obj = new smallestRange2();
        int result = obj.smallestRangeII(nums, k);

        System.out.println("Smallest possible range: " + result);
    }
}
