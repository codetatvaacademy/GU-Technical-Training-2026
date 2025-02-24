package Sorting;

import java.util.*;

public class threeSumClosests {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = 0;
        int diff = Integer.MAX_VALUE;
        int currDiff = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                currDiff = target - sum;

                if (Math.abs(currDiff) < Math.abs(diff)) {
                    diff = currDiff;
                    closestSum = sum;
                }

                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        scanner.close();

        threeSumClosests obj = new threeSumClosests();
        int result = obj.threeSumClosest(nums, target);

        System.out.println("Closest sum to target: " + result);
    }
}
